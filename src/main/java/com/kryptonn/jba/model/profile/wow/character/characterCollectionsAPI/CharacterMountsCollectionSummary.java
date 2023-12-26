package com.kryptonn.jba.model.profile.wow.character.characterCollectionsAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.kryptonn.jba.model.profile.wow.character.characterCollectionsAPI.characterMountsCollectionSummary.Links;
import com.kryptonn.jba.model.profile.wow.character.characterCollectionsAPI.characterMountsCollectionSummary.MountElement;

@lombok.Data
public class CharacterMountsCollectionSummary {
    @JsonProperty("_links")
    private Links links;
    private List<MountElement> mounts;
}
