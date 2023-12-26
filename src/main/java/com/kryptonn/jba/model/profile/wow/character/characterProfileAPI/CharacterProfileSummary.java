package com.kryptonn.jba.model.profile.wow.character.characterProfileAPI;

import com.kryptonn.jba.model.profile.wow.character.characterProfileAPI.characterProfileSummary.*;
import com.fasterxml.jackson.annotation.JsonProperty;
@lombok.Data
public class CharacterProfileSummary {
    @JsonProperty("_links")
    private Links links;
    private Long id;
    private String name;
    private Faction gender;
    private Faction faction;
    private ActiveSpec race;
    @JsonProperty("character_class")
    private ActiveSpec characterClass;
    @JsonProperty("active_spec")
    private ActiveSpec activeSpec;
    private ActiveSpec realm;
    private Guild guild;
    private Long level;
    private Long experience;
    @JsonProperty("achievement_points")
    private Long achievementPoints;
    private Achievements achievements;
    private Achievements titles;
    private Achievements pvpSummary;
    private Achievements encounters;
    private Achievements media;
    @JsonProperty("last_login_timestamp")
    private Long lastLoginTimestamp;
    @JsonProperty("average_item_level")
    private Long averageItemLevel;
    @JsonProperty("equipped_item_level")
    private Long equippedItemLevel;
    private Achievements specializations;
    private Achievements statistics;
    @JsonProperty("mythic_keystone_profile")
    private Achievements mythicKeystoneProfile;
    private Achievements equipment;
    private Achievements appearance;
    private Achievements collections;
    private ActiveSpec activeTitle;
    private Achievements reputations;
    private Achievements quests;
    @JsonProperty("achievements_statistics")
    private Achievements achievementsStatistics;
    private Achievements professions;
    @JsonProperty("covenant_progress")
    private CovenantProgress covenantProgress;
    @JsonProperty("name_search")
    private String nameSearch;
}
