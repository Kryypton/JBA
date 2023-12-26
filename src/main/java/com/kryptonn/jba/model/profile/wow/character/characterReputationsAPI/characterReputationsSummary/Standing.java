package com.kryptonn.jba.model.profile.wow.character.characterReputationsAPI.characterReputationsSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Standing {
    private Long raw;
    private Long value;
    private Long max;
    private Long tier;
    private String name;
    @JsonProperty("renown_level")
    private Long renownLevel;
}
