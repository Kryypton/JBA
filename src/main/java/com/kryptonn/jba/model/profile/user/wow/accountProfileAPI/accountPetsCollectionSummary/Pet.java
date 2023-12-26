package com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountPetsCollectionSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Pet {
    private Species species;
    private Long level;
    private Quality quality;
    private Stats stats;
    @JsonProperty("creature_display")
    private CreatureDisplay creatureDisplay;
    private Long id;
    @JsonProperty("is_active")
    private Boolean isActive;
    @JsonProperty("active_slot")
    private Long activeSlot;
    private String name;
}
