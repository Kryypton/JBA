package com.kryptonn.jba;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import com.kryptonn.jba.config.JBAServerLocales;
import com.kryptonn.jba.service.data.wow.AchievementService;
import com.kryptonn.jba.service.data.wow.AuctionHouseService;
import com.kryptonn.jba.service.data.wow.AzeritEssenceService;
import com.kryptonn.jba.service.data.wow.CovenantService;
import com.kryptonn.jba.service.data.wow.CreatureService;
import com.kryptonn.jba.service.data.wow.RealmService;

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
    public CommandLineRunner run(AchievementService achievementService, AuctionHouseService auctionHouseService, CreatureService creatureService, RealmService realmService, AzeritEssenceService azeritEssenceService, CovenantService covenantService) {
        return args -> {
            long start = System.currentTimeMillis();
            System.out.println(achievementService.getAchievementCategoryIndex());
            System.out.println("\n + \n");
            System.out.println(achievementService.getAchievementCategoryID(81));
            System.out.println("\n + \n");
            System.out.println(achievementService.getAchievementMedia(6));
            System.out.println("\n + \n");
            System.out.println("\n + \n");
            System.out.println(creatureService.getCreatureFamilliesIndex());
            System.out.println("\n + \n");
            System.out.println(creatureService.getCreatureFamily(1));
            System.out.println("\n + \n");
            System.out.println(creatureService.getCreatureTypesIndex());
            System.out.println("\n + \n");
            System.out.println(creatureService.getCreatureType(1));
            System.out.println("\n + \n");
            System.out.println(creatureService.getCreature(42722));
            System.out.println("\n + \n");
            System.out.println(creatureService.getCreatureFamilyMedia(1));
            System.out.println("\n + \n");
            System.out.println(creatureService.getCreatureDisplayMedia(30221));
            System.out.println("\n + \n");
            System.out.println(realmService.getRealmIndex());
            System.out.println("\n + \n");
            System.out.println(realmService.getRealmID(526));
            System.out.println("\n + \n");
            System.out.println(covenantService.getCovenantIndex());
            System.out.println("\n + \n");
            System.out.println(covenantService.getCovenant(1));
            System.out.println("\n + \n");
            System.out.println(covenantService.getCovenantMedia(1));
            System.out.println("\n + \n");
            System.out.println(covenantService.getSoulbindConduitIndex());
            System.out.println("\n + \n");
            System.out.println(covenantService.getSoulbindConduit(1));
            System.out.println("\n + \n");
            System.out.println(covenantService.getSoulbindIndex());
            System.out.println("\n + \n");
            System.out.println(covenantService.getSoulbind(1));
            System.out.println("\n + \n");
            long end = System.currentTimeMillis();
            System.out.println("Time: " + (end - start) + "ms");
        };
    }
}