package com.kryptonn.jba.model.profile.wow.character.characterSpecializationsAPI.characterSpecializationsSummary;

@lombok.Data
public class SpellTooltip {
    private ActiveSpecialization spell;
    private String description;
    private String castTime;
    private String range;
    private String cooldown;
    private String powerCost;
}
