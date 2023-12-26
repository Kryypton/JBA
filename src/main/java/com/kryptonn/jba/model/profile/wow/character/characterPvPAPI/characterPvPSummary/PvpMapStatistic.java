package com.kryptonn.jba.model.profile.wow.character.characterPvPAPI.characterPvPSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class PvpMapStatistic {
    @JsonProperty("world_map")
    private WorldMap worldMap;
    @JsonProperty("match_statistics")
    private MatchStatistics matchStatistics;
}
