package com.kryptonn.jba.model.profile.wow.character.characterEquipmentAPI.characterEquipmentSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Enchantment {
    @JsonProperty("display_string")
    private String displayString;
    @JsonProperty("source_item")
    private Character sourceItem;
    @JsonProperty("enchantment_id")
    private Long enchantmentID;
    @JsonProperty("enchantment_slot")
    private EnchantmentSlot enchantmentSlot;
}
