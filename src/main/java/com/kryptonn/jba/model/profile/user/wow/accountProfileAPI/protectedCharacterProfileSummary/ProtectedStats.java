package com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.protectedCharacterProfileSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class ProtectedStats {
    @JsonProperty("total_number_deaths")
    private Long totalNumberDeaths;
    @JsonProperty("total_gold_gained")
    private Long totalGoldGained;
    @JsonProperty("total_gold_lost")
    private Long totalGoldLost;
    @JsonProperty("total_item_value_gained")
    private Long totalItemValueGained;
    @JsonProperty("level_number_deaths")
    private Long levelNumberDeaths;
    @JsonProperty("level_gold_gained")
    private Long levelGoldGained;
    @JsonProperty("level_gold_lost")
    private Long levelGoldLost;
    @JsonProperty("level_item_value_gained")
    private Long levelItemValueGained;
}
