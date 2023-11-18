package com.kryptonn.jba;

import com.kryptonn.jba.builder.JBABuilderOAuth;
import com.kryptonn.jba.client.JBA;
import com.kryptonn.jba.client.JBAServerLocales;

/**
 * @author Kryptonn
 * @version 1.0.1
 * @since 1.0.1
 * This is a simple example of how to use the JBA library.
 * <p>
 *    This example shows how to get an access token using the OAuth authentication.
 * </p>
 */
public class Main {
    /**
     * Main method.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        JBA jba = JBABuilderOAuth.createOAuthAccess("clientid", "clientSecret", JBAServerLocales.FR).build();
        System.out.println(jba.getAccessToken());
    }
}
