package com.kryptonn.jba.model.profile.wow.character.characterEquipmentAPI.characterEquipmentSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Spell {
    private Character spell;
    private String description;
    @JsonProperty("display_color")
    private Color displayColor;
}
