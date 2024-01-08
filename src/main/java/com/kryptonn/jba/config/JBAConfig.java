package com.kryptonn.jba.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kryptonn.jba.security.oauth.JBA;

import org.springframework.beans.factory.annotation.Value;

@Configuration
public class JBAConfig {
    @Bean
    public JBA jba(@Value("${battle.net.client-id}") String clientId,
                   @Value("${battle.net.client-secret}") String clientSecret,
                   @Value("${battle.net.region}") String region) {
        return new JBA(clientId, clientSecret, JBAServerLocales.valueOf(region.toUpperCase()));
    }
}
