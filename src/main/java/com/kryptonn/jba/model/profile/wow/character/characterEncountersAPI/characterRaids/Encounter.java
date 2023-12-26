package com.kryptonn.jba.model.profile.wow.character.characterEncountersAPI.characterRaids;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Encounter {
    private Character encounter;
    @JsonProperty("completed_count")
    private Long completedCount;
    @JsonProperty("last_kill_timestamp")
    private Long lastKillTimestamp;
}
