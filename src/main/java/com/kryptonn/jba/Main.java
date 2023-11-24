package com.kryptonn.jba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.kryptonn.jba.security.oauth.JBA;

/**
 * @author Kryptonn
 * @version 1.0.1
 * @since 1.0.1
 * This is a simple example of how to use the JBA library.
 * <p>
 *    This example shows how to get an access token using the OAuth authentication.
 * </p>
 */
@SpringBootApplication
@EnableScheduling
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);
        JBA jba = context.getBean(JBA.class);

        String token = jba.getAccessToken();
        System.out.println("Access Token: " + token);
    }
}

