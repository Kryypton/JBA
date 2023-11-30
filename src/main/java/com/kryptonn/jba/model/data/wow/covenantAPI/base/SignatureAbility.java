package com.kryptonn.jba.model.data.wow.covenantAPI.base;

import com.fasterxml.jackson.annotation.JsonProperty;

public record SignatureAbility(String id) {
    @JsonProperty("spell_tooltip")
    private static SpellTooltip spellTooltip;

}
