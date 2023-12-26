package com.kryptonn.jba.model.profile.wow.character.characterEquipmentAPI.characterEquipmentSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class NameDescription {
    @JsonProperty("display_string")
    private String displayString;
    private Color color;
}
