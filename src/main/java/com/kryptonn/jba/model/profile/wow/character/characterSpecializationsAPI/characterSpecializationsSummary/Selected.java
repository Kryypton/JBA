package com.kryptonn.jba.model.profile.wow.character.characterSpecializationsAPI.characterSpecializationsSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Selected {
    private ActiveSpecialization talent;
    @JsonProperty("spell_tooltip")
    private SpellTooltip spellTooltip;
}
