package com.kryptonn.jba;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import com.kryptonn.jba.config.JBAServerLocales;
import com.kryptonn.jba.model.data.wow.AchievementCategoryIndex;
import com.kryptonn.jba.service.data.wow.AchievementService;

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
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public JBAServerLocales jbaServerLocales() {
        return JBAServerLocales.FR;
    }

    @Bean
    public CommandLineRunner run(AchievementService achievementService) {
        return args -> {
            long start = System.currentTimeMillis();
            AchievementCategoryIndex index = achievementService.getAchievementCategoryIndex();
            System.out.println(index);
            long end = System.currentTimeMillis();
            System.out.println("Time: " + (end - start) + "ms");
        };
    }
}