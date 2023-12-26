package com.kryptonn.jba.model.profile.wow.character.characterStatisticsAPI.characterStatisticsSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Block {
    private Long rating;
    @JsonProperty("rating_bonus")
    private Double ratingBonus;
    private Double value;
}
