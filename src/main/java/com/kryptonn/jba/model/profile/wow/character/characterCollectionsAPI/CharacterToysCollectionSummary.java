package com.kryptonn.jba.model.profile.wow.character.characterCollectionsAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.kryptonn.jba.model.profile.wow.character.characterCollectionsAPI.characterToysCollectionSummary.Links;
import com.kryptonn.jba.model.profile.wow.character.characterCollectionsAPI.characterToysCollectionSummary.ToyElement;

@lombok.Data
public class CharacterToysCollectionSummary {
    @JsonProperty("_links")
    private Links links;
    private List<ToyElement> toys;
}
