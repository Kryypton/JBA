package com.kryptonn.jba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kryptonn.jba.model.data.wow.guild.GuildAPI.GuildRoster;
import com.kryptonn.jba.model.data.wow.guild.GuildAPI.guildRoster.Character;
import com.kryptonn.jba.security.oauth.builder.JBABuilderOAuth;
import com.kryptonn.jba.config.JBAServerLocales;
import com.kryptonn.jba.model.data.wow.guild.GuildAPI.Guild;
import com.kryptonn.jba.service.data.wow.JBAService;
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
public class Main {
    
    @Autowired
    private JBA jba;
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
            JBA jba = JBABuilderOAuth.createOAuthAccess("937e03d32a5b47a4b20035dd343ca591", "eLepPcWN1ixcEbEQPGVL1Krmj8AXRxn8", JBAServerLocales.FR).build();
            JBAService service = jba.getService();
            long start = System.currentTimeMillis();
            Guild guild = service.getGuild("Hyjal", "Gardiens éternels").getData();
            System.out.println(guild.getName() + ": " + guild.getFaction().getName() + " - " + guild.getRealm().getName() + " - " + guild.getMemberCount());
            GuildRoster gR = (GuildRoster) service.getRessource(guild.getRoster().getHref(), GuildRoster.class).getData();
            Character c = service.getRessource(gR.getMembers().get(0).getCharacter().getKey().getHref(), Character.class).getData();
            System.out.println(c.getName());
            long end = System.currentTimeMillis();
            System.out.println("Time: " + (end - start) + "ms");
            
    }

    public CommandLineRunner run() throws Exception {
        return args -> {
            JBAService service = this.jba.getService();
            long start = System.currentTimeMillis();
            Guild guild = service.getGuild("Hyjal", "Gardiens éternels").getData();
            System.out.println(guild.getName() + ": " + guild.getFaction().getName() + " - " + guild.getRealm().getName() + " - " + guild.getMemberCount());
            GuildRoster gR = (GuildRoster) service.getRessource(guild.getRoster().getHref(), GuildRoster.class).getData();
            Character c = service.getRessource(gR.getMembers().get(0).getCharacter().getKey().getHref(), Character.class).getData();
            System.out.println(c.getName());
            long end = System.currentTimeMillis();
            System.out.println("Time: " + (end - start) + "ms");
        };
    }
}