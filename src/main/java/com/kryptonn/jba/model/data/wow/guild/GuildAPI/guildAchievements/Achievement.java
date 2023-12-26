package com.kryptonn.jba.model.data.wow.guild.GuildAPI.guildAchievements;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Achievement {
    private Long id;
    private Realm achievement;
    private Criteria criteria;
    @JsonProperty("completed_timestamp")
    private Long completedTimestamp;
}
