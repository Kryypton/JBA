package com.kryptonn.jba.model.profile.wow.character.characterMythicKeystoneProfileAPI;

import java.util.List;

import com.kryptonn.jba.model.profile.wow.character.characterMythicKeystoneProfileAPI.characterMythicKeystoneSeasonDetails.*;
import com.fasterxml.jackson.annotation.JsonProperty;
@lombok.Data
public class CharacterMythicKeystoneSeasonDetails {
    @JsonProperty("_links")
    private Links links;
    private Season season;
    @JsonProperty("best_runs")
    private List<BestRun> bestRuns;
    private RealmClass character;
    @JsonProperty("mythic_rating")
    private MythicRating mythicRating;
}
