package com.kryptonn.jba.model.profile.wow.character.characterEquipmentAPI.characterEquipmentSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Weapon {
    private Damage damage;
    @JsonProperty("attack_speed")
    private Durability attackSpeed;
    private Durability dps;
}
