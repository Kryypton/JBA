package com.kryptonn.jba.model.profile.wow.character.characterCollectionsAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.kryptonn.jba.model.profile.wow.character.characterCollectionsAPI.characterPetsCollectionSummary.Links;
import com.kryptonn.jba.model.profile.wow.character.characterCollectionsAPI.characterPetsCollectionSummary.Pet;

@lombok.Data
public class CharacterPetsCollectionSummary {
    @JsonProperty("_links")
    private Links links;
    private List<Pet> pets;
    @JsonProperty("unlocked_battle_pet_slots")
    private Long unlockedBattlePetSlots;
}
