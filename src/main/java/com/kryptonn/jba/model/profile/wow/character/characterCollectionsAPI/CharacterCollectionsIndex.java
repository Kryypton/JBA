package com.kryptonn.jba.model.profile.wow.character.characterCollectionsAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.kryptonn.jba.model.profile.wow.character.characterCollectionsAPI.characterCollectionsIndex.Heirlooms;
import com.kryptonn.jba.model.profile.wow.character.characterCollectionsAPI.characterCollectionsIndex.Links;

@lombok.Data
public class CharacterCollectionsIndex {
    @JsonProperty("_links")
    private Links links;
    private Heirlooms pets;
    private Heirlooms mounts;
    private Heirlooms heirlooms;
    private Heirlooms toys;
    private Character character;
    private Heirlooms transmogs;
}
