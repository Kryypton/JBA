package com.kryptonn.jba.model.profile.wow.character.characterEquipmentAPI.characterEquipmentSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Requirements {
    private Durability level;
    @JsonProperty("playable_classes")
    private PlayableClasses playableClasses;
}
