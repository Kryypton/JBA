package com.kryptonn.jba.builder;

import com.kryptonn.jba.client.JBA;
import com.kryptonn.jba.client.JBAServerLocales;

/**
 * @author Kryptonn
 * @version 1.0.1
 * @since 1.0.1
 * JBABuilderOAuth is a builder class that allows you to create a JBA object with the OAuth authentication.
 * <p>
 *    The OAuth authentication is used to get an access token that is used to authenticate requests to the Battle.net API.
 * </p>
 */
public class JBABuilderOAuth {

    private String clientId;
    private String clientSecret;
    private JBAServerLocales region;

    /**
     * Constructs a JBABuilderOAuth instance with the provided client ID, client secret and region.
     * @param clientId The client ID provided by Battle.net for OAuth authentication.
     * @param clientSecret The client secret provided by Battle.net for OAuth authentication.
     * @param region The region of the JBAServerLocales instance.
     */
    private JBABuilderOAuth(String clientId, String clientSecret, JBAServerLocales region) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.region = region;
    }

    /**
     * Returns a JBABuilderOAuth instance with the provided client ID, client secret and region.
     * @param clientId The client ID provided by Battle.net for OAuth authentication.
     * @param clientSecret The client secret provided by Battle.net for OAuth authentication.
     * @param region The region of the JBAServerLocales instance.
     * @return
     */
    public static JBABuilderOAuth createOAuthAccess(String clientId, String clientSecret, JBAServerLocales region) {
        return new JBABuilderOAuth(clientId, clientSecret, region);
    }

    /**
     * Returns a JBA instance with the provided client ID, client secret and region.
     * @return A JBA instance with the provided client ID, client secret and region.
     */
    public JBA build() {
        return new JBA(clientId, clientSecret, region);
    }
}