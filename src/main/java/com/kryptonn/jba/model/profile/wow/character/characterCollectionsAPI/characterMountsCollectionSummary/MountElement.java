package com.kryptonn.jba.model.profile.wow.character.characterCollectionsAPI.characterMountsCollectionSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class MountElement {
    private MountMount mount;
    @JsonProperty("is_useable")
    private Boolean isUseable;
    @JsonProperty("is_character_specific")
    private Boolean isCharacterSpecific;
}
