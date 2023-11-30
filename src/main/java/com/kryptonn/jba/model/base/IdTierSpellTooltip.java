package com.kryptonn.jba.model.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.data.wow.covenantAPI.base.SpellTooltip;

public record IdTierSpellTooltip(String id) {
    @JsonProperty("spell_tooltip")
    private static SpellTooltip spellTooltip;
}
