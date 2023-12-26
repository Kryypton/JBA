package com.kryptonn.jba.model.profile.wow.character.characterEquipmentAPI.characterEquipmentSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Stat {
    private Binding type;
    private Long value;
    private NameDescription display;
    @JsonProperty("is_negated")
    private Boolean isNegated;
    @JsonProperty("is_equip_bonus")
    private Boolean isEquipBonus;
}
