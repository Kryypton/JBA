package com.kryptonn.jba.model.profile.wow.character.characterCollectionsAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountHeirloomsCollectionSummary.Links;
import com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountHeirloomsCollectionSummary.HeirloomElement;

@lombok.Data
public class CharacterHeirloomsCollectionSummary {
    @JsonProperty("_links")
    private Links links;
    private List<HeirloomElement> heirlooms;
}
