package com.kryptonn.jba.model.profile.wow.character.characterEquipmentAPI.characterEquipmentSummary;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Set {
    private Character itemSet;
    private List<ItemElement> items;
    private List<Effect> effects;
    @JsonProperty("display_string")
    private String displayString;
}
