package com.kryptonn.jba.model.profile.wow.character.characterEquipmentAPI.characterEquipmentSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Damage {
    @JsonProperty("min_value")
    private Long minValue;
    @JsonProperty("max_value")
    private Long maxValue;
    @JsonProperty("display_string")
    private String displayString;
    @JsonProperty("damage_class")
    private Binding damageClass;
}
