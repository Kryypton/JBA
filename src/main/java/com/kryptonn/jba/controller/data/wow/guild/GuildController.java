package com.kryptonn.jba.controller.data.wow.guild;

import com.kryptonn.jba.client.ApiResponse;
import com.kryptonn.jba.model.data.wow.guild.GuildAPI.Guild;
import com.kryptonn.jba.service.data.wow.JBAService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guild")
public class GuildController {
    private final JBAService guildService;

    public GuildController(JBAService guildService) {
        this.guildService = guildService;
    }

    @GetMapping("/{realmSlug}/{guildSlug}")
    public Object getGuild(String realmSlug, String guildSlug) {
        ApiResponse<Guild> r = guildService.getGuild(realmSlug, guildSlug);
        try {
            return r.getData();
        } catch (Exception e) {
            return r.getStatusCode();
        }
    }

    
}
