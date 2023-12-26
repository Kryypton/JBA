package com.kryptonn.jba.model.data.wow.guild.GuildAPI.guildAchievements;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Criteria {
    private Long id;
    @JsonProperty("is_completed")
    private Boolean isCompleted;
    @JsonProperty("child_criteria")
    private List<Criteria> childCriteria;
    private Long amount;
}
