package com.kryptonn.jba.model.profile.wow.character.characterAchievementsAPI.characterAchievementStatistics;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class SubCategoryStatistic {
    private Long id;
    private String name;
    @JsonProperty("last_updated_timestamp")
    private Long lastUpdatedTimestamp;
    private Long quantity;
    private String description;
}
