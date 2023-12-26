package com.kryptonn.jba.model.data.wow.guild.GuildAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.data.wow.guild.GuildAPI.guild.*;

@lombok.Data
public class Guild {
    @JsonProperty("_links")
    private Links links;
    private Long id;
    private String name;
    private Faction faction;
    @JsonProperty("achievement_points")
    private Long achievementPoints;
    @JsonProperty("member_count")
    private Long memberCount;
    private Realm realm;
    private Crest crest;
    private Achievements roster;
    private Achievements achievements;
    @JsonProperty("created_timestamp")
    private Long createdTimestamp;
    private Achievements activity;
    private String nameSearch;
}
