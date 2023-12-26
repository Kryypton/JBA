package com.kryptonn.jba.model.profile.wow.character.characterEquipmentAPI.characterEquipmentSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Effect {
    @JsonProperty("display_string")
    private String displayString;
    @JsonProperty("required_count")
    private Long requiredCount;
    @JsonProperty("is_active")
    private Boolean isActive;
}
