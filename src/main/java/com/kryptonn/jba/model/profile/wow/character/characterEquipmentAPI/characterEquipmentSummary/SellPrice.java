package com.kryptonn.jba.model.profile.wow.character.characterEquipmentAPI.characterEquipmentSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class SellPrice {
    private Long value;
    @JsonProperty("display_strings")
    private DisplayStrings displayStrings;
}
