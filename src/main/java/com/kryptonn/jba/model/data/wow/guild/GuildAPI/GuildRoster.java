package com.kryptonn.jba.model.data.wow.guild.GuildAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.data.wow.guild.GuildAPI.guildRoster.*;

@lombok.Data
public class GuildRoster {
    @JsonProperty("_links")
    private Links links;
    private Guild guild;
    private List<Member> members;
}
