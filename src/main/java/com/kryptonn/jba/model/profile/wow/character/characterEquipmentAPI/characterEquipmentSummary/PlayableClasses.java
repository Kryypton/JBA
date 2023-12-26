package com.kryptonn.jba.model.profile.wow.character.characterEquipmentAPI.characterEquipmentSummary;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class PlayableClasses {
    private List<Character> links;
    @JsonProperty("display_string")
    private String displayString;
}
