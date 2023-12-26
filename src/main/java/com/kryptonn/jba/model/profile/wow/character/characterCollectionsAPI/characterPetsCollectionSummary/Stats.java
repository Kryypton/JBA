package com.kryptonn.jba.model.profile.wow.character.characterCollectionsAPI.characterPetsCollectionSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Stats {
    @JsonProperty("breed_id")
    private Long breedID;
    private Long health;
    private Long power;
    private Long speed;
}
