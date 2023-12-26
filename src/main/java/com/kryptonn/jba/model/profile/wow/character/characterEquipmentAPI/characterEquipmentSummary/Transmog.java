package com.kryptonn.jba.model.profile.wow.character.characterEquipmentAPI.characterEquipmentSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Transmog {
    private Character item;
    @JsonProperty("display_string")
    private String displayString;
    @JsonProperty("item_modified_appearance_id")
    private Long itemModifiedAppearanceID;
}
