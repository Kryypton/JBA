package com.kryptonn.jba.model.data.wow.covenantAPI.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.KeyNameID;

public record ClassAbilities(Integer id) {
    @JsonProperty("playable_class")
    private static KeyNameID playableClass;
    @JsonProperty("spell_tooltip")
    private static SpellTooltip spellTooltip;

}
