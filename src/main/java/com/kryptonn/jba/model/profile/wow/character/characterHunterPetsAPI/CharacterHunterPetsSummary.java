package com.kryptonn.jba.model.profile.wow.character.characterHunterPetsAPI;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.profile.wow.character.characterHunterPetsAPI.characterHunterPetsSummary.Character;
import com.kryptonn.jba.model.profile.wow.character.characterHunterPetsAPI.characterHunterPetsSummary.*;

@lombok.Data
public class CharacterHunterPetsSummary {
    @JsonProperty("_links")
    private Links links;
    private Character character;
    @JsonProperty("hunter_pets")
    private List<HunterPet> hunterPets;
}
