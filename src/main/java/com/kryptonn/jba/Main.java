package com.kryptonn.jba;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import com.kryptonn.jba.client.ApiResponse;
import com.kryptonn.jba.config.JBAServerLocales;
import com.kryptonn.jba.model.data.wow.guild.GuildAPI.GuildRoster;
import com.kryptonn.jba.model.data.wow.guild.GuildAPI.guildRoster.Character;
import com.kryptonn.jba.model.profile.wow.character.characterProfileAPI.CharacterProfileSummary;
import com.kryptonn.jba.model.data.wow.guild.GuildAPI.Guild;
import com.kryptonn.jba.service.data.wow.JBAService;

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
        public CommandLineRunner run(JBAService service) {
            return args -> {
                long start = System.currentTimeMillis();
                Guild guild = service.getGuild("Hyjal", "Gardiens éternels").getData();
                Guild guild2 = (Guild) service.getRessource(guild.getLinks().getSelf().getHref(), Guild.class).getData();
                System.out.println(guild2.getRoster().getHref());
                GuildRoster gR = (GuildRoster) service.getRessource(guild2.getRoster().getHref(), GuildRoster.class).getData();
                Character c = (Character) service.getRessource(gR.getMembers().get(0).getCharacter().getKey().getHref(), Character.class).getData();
                System.out.println(c.getName());
                com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountProfileSummary.Character c3 = (com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountProfileSummary.Character) service.getAccountProfileSummary().getData();
                System.out.println(c3.getName());

                CharacterProfileSummary c2 = service.getProfileSummary("hyjal", "xénonn").getData();
                System.out.println(c2.getName());
                long end = System.currentTimeMillis();
                System.out.println("Time: " + (end - start) + "ms");
            };
        } // https://eu.api.blizzard.com/data/wow/guild/hyjal/gardiens-C3A9ternels?namespace=profile-eu&locale=fr_FR&access_token=EUNAx3R74suQIzj6wdGGhVhoFq6aE30mBh
}