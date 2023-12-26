package com.kryptonn.jba.model.profile.wow.character.characterSpecializationsAPI.characterSpecializationsSummary;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Loadout {
    @JsonProperty("is_active")
    private Boolean isActive;
    @JsonProperty("talent_loadout_code")
    private String talentLoadoutCode;
    @JsonProperty("selected_class_talents")
    private List<SelectedTalent> selectedClassTalents;
    @JsonProperty("selected_spec_talents")
    private List<SelectedTalent> selectedSpecTalents;
}
