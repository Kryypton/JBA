package com.kryptonn.jba.model.profile.wow.character.characterEquipmentAPI.characterEquipmentSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class ItemElement {
    private Character item;
    @JsonProperty("is_equipped")
    private Boolean isEquipped;
}
