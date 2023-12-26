package com.kryptonn.jba.model.profile.wow.character.characterSpecializationsAPI.characterSpecializationsSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class SelectedTalent {
    private Long id;
    private Long rank;
    private Selected tooltip;
    @JsonProperty("default_points")
    private Long defaultPoints;
}
