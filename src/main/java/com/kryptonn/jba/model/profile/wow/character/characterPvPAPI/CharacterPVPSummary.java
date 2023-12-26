package com.kryptonn.jba.model.profile.wow.character.characterPvPAPI;

import java.util.List;
import com.kryptonn.jba.model.profile.wow.character.characterPvPAPI.characterPvPSummary.*;
import com.kryptonn.jba.model.profile.wow.character.characterPvPAPI.characterPvPSummary.Character;
import com.fasterxml.jackson.annotation.JsonProperty;
@lombok.Data
public class CharacterPVPSummary {
    @JsonProperty("_links")
    private Links links;
    private List<Bracket> brackets;
    @JsonProperty("honor_level")
    private Long honorLevel;
    @JsonProperty("pvp_map_statistics")
    private List<PvpMapStatistic> pvpMapStatistics;
    @JsonProperty("honorable_kills")
    private Long honorableKills;
    private Character character;
}
