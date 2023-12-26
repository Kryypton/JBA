package com.kryptonn.jba.model.profile.wow.character.characterHunterPetsAPI.characterHunterPetsSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class HunterPet {
    private String name;
    private Long level;
    private Character creature;
    private Long slot;
    @JsonProperty("creature_display")
    private CreatureDisplay creatureDisplay;
    @JsonProperty("is_active")
    private Boolean isActive;
}
