package com.kryptonn.jba.model.profile.wow.character.characterEncountersAPI.characterDungeons;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Progress {
    @JsonProperty("completed_count")
    private Long completedCount;
    private Long totalCount;
    private List<Encounter> encounters;
}
