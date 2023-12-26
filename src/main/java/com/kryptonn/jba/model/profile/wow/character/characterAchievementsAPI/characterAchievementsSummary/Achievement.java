package com.kryptonn.jba.model.profile.wow.character.characterAchievementsAPI.characterAchievementsSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Achievement {
    private Long id;
    private Character achievement;
    private Criteria criteria;
    @JsonProperty("completed_timestamp")
    private Long completedTimestamp;
}
