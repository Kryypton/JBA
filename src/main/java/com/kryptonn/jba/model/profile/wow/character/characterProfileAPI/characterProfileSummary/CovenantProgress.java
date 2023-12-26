package com.kryptonn.jba.model.profile.wow.character.characterProfileAPI.characterProfileSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class CovenantProgress {
    @JsonProperty("chosen_covenant")
    private ActiveSpec chosenCovenant;
    @JsonProperty("renown_level")
    private Long renownLevel;
    private Achievements soulbinds;
}
