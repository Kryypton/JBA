package com.kryptonn.jba.model.profile.wow.character.characterSpecializationsAPI.characterSpecializationsSummary;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Specialization {
    private ActiveSpecialization specialization;
    private List<ActiveSpecialization> glyphs;
    @JsonProperty("pvp_talent_slots")
    private List<PvpTalentSlot> pvpTalentSlots;
    private List<Loadout> loadouts;
}
