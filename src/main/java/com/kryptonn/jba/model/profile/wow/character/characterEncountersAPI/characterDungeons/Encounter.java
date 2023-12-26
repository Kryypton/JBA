package com.kryptonn.jba.model.profile.wow.character.characterEncountersAPI.characterDungeons;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Encounter {
    private InstanceClass encounter;
    @JsonProperty("completed_count")
    private Long completedCount;
    @JsonProperty("last_kill_timestamp")
    private Long lastKillTimestamp;
}
