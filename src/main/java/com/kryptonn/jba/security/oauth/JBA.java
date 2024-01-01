package com.kryptonn.jba.security.oauth;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Instant;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kryptonn.jba.client.BlizzardApiClient;
import com.kryptonn.jba.config.JBAServerLocales;
import com.kryptonn.jba.exception.oauth.JBAClientInfoNotValidException;
import com.kryptonn.jba.model.oauth.TokenResponse;
import com.kryptonn.jba.service.data.wow.JBAService;

import jakarta.annotation.PostConstruct;



/**
 * @author Kryptonn
 * @version 1.0.1
 * @since 1.0.0
 * JBA is the main class for handling the connection with Battle.net's OAuth service.
 * It provides methods to retrieve and automatically refresh the access token needed
 * for authenticated requests to the Battle.net API.
 * <p>Usage example:</p>
 * <pre>{@code
 * JBA jba = JBABuilderOAuth.createOAuthAccess("clientId", "clientSecret").build();
 * String accessToken = jba.getAccessToken();
 * }</pre>
 * @see com.kryptonn.jba.builder.JBABuilderOAuth for manual creation of a JBA object.
 */
@Component
public class JBA {
    @Value("${battle.net.client-id}")
    private String clientId;

    @Value("${battle.net.client-secret}")
    private String clientSecret;

    private TokenResponse tokenResponse;
    private Instant expiresAt;

    private final JBAServerLocales region;
    private final CloseableHttpClient httpClient;
    private final ObjectMapper objectMapper;

    private static final Logger logger = LoggerFactory.getLogger(JBA.class);

    /**
     * Constructs a JBA instance with the provided client credentials.
     * @param clientId     The client ID provided by Battle.net for OAuth authentication.
     * @param clientSecret The client secret provided by Battle.net for OAuth authentication.
     */
    public JBA(@Value("${battle.net.client-id}") String clientId,
               @Value("${battle.net.client-secret}") String clientSecret,
               @Value("${battle.net.region}") JBAServerLocales region) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.region = region;
        this.httpClient = HttpClients.createDefault();
        this.objectMapper = new ObjectMapper();
    }

    @PostConstruct
    private void init() {
        try {
            logger.info("[JBA] Initializing JBA object");
            refreshToken();
        } catch (IOException | JBAClientInfoNotValidException | URISyntaxException e) {
            logger.error("[JBA] Error during initial token refresh", e);
        }
    }

    public JBAService getService() {
        return new JBAService(new BlizzardApiClient(this));
    }

    /**
     * Refreshes the OAuth token by making a new request to the Battle.net token endpoint.
     * This method will be called automatically when the current token is about to expire.
     * @throws JBAClientInfoNotValidException If the provided client credentials are not valid.
     * @throws IOException If there is a problem with the network connection or server.
     */
    @Scheduled(fixedDelayString = "${battle.net.token-refresh-rate}")
    private void refreshToken() throws JBAClientInfoNotValidException, IOException, URISyntaxException {
        CredentialsProvider provider = new BasicCredentialsProvider();
        UsernamePasswordCredentials credentials = new UsernamePasswordCredentials(this.clientId, this.clientSecret);
        provider.setCredentials(AuthScope.ANY, credentials);
        AuthCache authCache = new BasicAuthCache();
        BasicScheme basicAuth = new BasicScheme();
        authCache.put(new HttpHost(this.region.getOAuth(), 443, "https"), basicAuth);

        HttpClientContext context = HttpClientContext.create();
        context.setCredentialsProvider(provider);
        context.setAuthCache(authCache);

        URI uri = new URIBuilder("https://" + this.region.getOAuth() + "/oauth/token")
            .addParameter("grant_type", "client_credentials")
            .addParameter("region", this.region.name().toLowerCase())
            .build();

        HttpPost httpPost = new HttpPost(uri);
        httpPost.setEntity(new StringEntity("grant_type=client_credentials"));
        httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded");

        HttpResponse response = httpClient.execute(httpPost, context);
        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode == 200) {
            String responseBody = EntityUtils.toString(response.getEntity());
            this.tokenResponse = objectMapper.readValue(responseBody, TokenResponse.class);
            this.expiresAt = Instant.now().plusSeconds(tokenResponse.getExpiresIn() - 300);
            logger.info("[JBA] Token refreshed successfully");
        } else {
            logger.error("[JBA] Token refresh failed with status code " + statusCode);
            throw new JBAClientInfoNotValidException("Client ID or Client Secret is not valid");
        }
    }

    /**
     * Returns the current access token. If the token has expired, it triggers a refresh.
     *
     * @return The current valid access token.
     */
    public String getAccessToken() {
        // Vérifie si tokenResponse est null
        if (this.tokenResponse == null) {
            // Gère le cas où tokenResponse est null. Par exemple, vous pouvez tenter de rafraîchir le token.
            try {
                refreshToken();
            } catch (Exception e) {
                // Gestion de l'erreur lors de la tentative de rafraîchissement du token
                logger.error("[JBA] Erreur lors du rafraîchissement du token", e);
                return null; // Ou gérer autrement selon la logique de votre application
            }
    
            // Vérifie à nouveau si tokenResponse est toujours null après la tentative de rafraîchissement
            if (this.tokenResponse == null) {
                logger.error("[JBA] tokenResponse est toujours null après la tentative de rafraîchissement");
                return null; // Ou gérer autrement selon la logique de votre application
            }
        }
    
        return this.tokenResponse.getAccessToken();
    }
    

    /**
     * Returns the client ID.
     * @return The client ID.
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Returns the client secret.
     * @return The client secret.
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Returns the time at which the current access token will expire.
     * @return The time at which the current access token will expire.
     * @see java.time.Instant
     */
    public Instant getExpiresAt() {
        return expiresAt;
    }

    /**
     * Returns the current region.
     * @return The current region.
     * @see com.kryptonn.jba.config.client.JBAServerLocales
     */
    public JBAServerLocales getRegion() {
        return region;
    }

    /**
     * Returns the current token response. If the token has expired, it triggers a refresh.
     * @return The current valid token response.
     * @see com.kryptonn.jba.model.oauth.client.TokenResponse
     */
    public TokenResponse getTokenResponse() {
        return tokenResponse;
    }

    /**
     * Returns a string representation of the JBA object.
     * @return A string that "textually represents" the JBA object.
     */
    public String toString() {
        return "JBA{" +
                "accessToken='" + getAccessToken() + '\'' +
                ", expiresAt=" + getExpiresAt() +
                ", clientId='" + getClientId() + '\'' +
                ", clientSecret='" + getClientSecret() + '\'' +
                '}';
    }
}