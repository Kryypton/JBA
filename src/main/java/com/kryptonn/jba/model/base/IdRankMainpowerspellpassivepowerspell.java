package com.kryptonn.jba.model.base;

import com.fasterxml.jackson.annotation.JsonProperty;

public record IdRankMainpowerspellpassivepowerspell(Integer id, Integer rank) {
    @JsonProperty("main_power_spell")
    private static KeyNameID mainPowerSpell;
    @JsonProperty("passive_power_spell")
    private static KeyNameID passivePowerSpell;
}
