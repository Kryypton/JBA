package com.kryptonn.jba.model.profile.wow.character.characterPvPAPI;

import com.kryptonn.jba.model.profile.wow.character.characterPvPAPI.characterPvPBracketStatistics.*;
import com.kryptonn.jba.model.profile.wow.character.characterPvPAPI.characterPvPBracketStatistics.Character;
import com.fasterxml.jackson.annotation.JsonProperty;
@lombok.Data
public class CharacterPVPBracketStatistics {
    @JsonProperty("_links")
    private Links links;
    private Character character;
    private Faction faction;
    private Bracket bracket;
    private Long rating;
    private Season season;
    private Season tier;
    @JsonProperty("season_match_statistics")
    private MatchStatistics seasonMatchStatistics;
    @JsonProperty("weekly_match_statistics")
    private MatchStatistics weeklyMatchStatistics;
}
