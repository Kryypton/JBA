package com.kryptonn.jba.client;

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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kryptonn.jba.exception.JBAClientInfoNotValidException;

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
 * @see com.kryptonn.jba.builder.JBABuilderOAuth
 */
public class JBA {
    private TokenResponse tokenResponse;
    private Instant expiresAt;
    private final String clientId;
    private final String clientSecret;
    private final JBAServerLocales region;
    private final CloseableHttpClient httpClient;
    private final ObjectMapper objectMapper;

    /**
     * Constructs a JBA instance with the provided client credentials.
     * @param clientId     The client ID provided by Battle.net for OAuth authentication.
     * @param clientSecret The client secret provided by Battle.net for OAuth authentication.
     */
    public JBA(String clientId, String clientSecret, JBAServerLocales region) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.region = region;
        this.httpClient = HttpClients.createDefault();
        this.objectMapper = new ObjectMapper();

        try {
            refreshToken();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JBAClientInfoNotValidException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    /**
     * Refreshes the OAuth token by making a new request to the Battle.net token endpoint.
     * This method will be called automatically when the current token is about to expire.
     * @throws JBAClientInfoNotValidException If the provided client credentials are not valid.
     * @throws IOException If there is a problem with the network connection or server.
     */
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
        } else {
            throw new JBAClientInfoNotValidException("Client ID or Client Secret is not valid");
        }
    }

    /**
     * Checks if the current access token has expired and refreshes it if necessary.
     * This method is synchronized to prevent multiple threads from trying to refresh
     * the token simultaneously.
     */
    private synchronized void checkExpiration() {
        if (Instant.now().isAfter(expiresAt)) {
            try {
                refreshToken();
            } catch (JBAClientInfoNotValidException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Returns the current access token. If the token has expired, it triggers a refresh.
     *
     * @return The current valid access token.
     */
    public String getAccessToken() {
        checkExpiration();
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
     * @see com.kryptonn.jba.client.JBAServerLocales
     */
    public JBAServerLocales getRegion() {
        return region;
    }

    /**
     * Returns the current token response. If the token has expired, it triggers a refresh.
     * @return The current valid token response.
     * @see com.kryptonn.jba.client.TokenResponse
     */
    public TokenResponse getTokenResponse() {
        checkExpiration();
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