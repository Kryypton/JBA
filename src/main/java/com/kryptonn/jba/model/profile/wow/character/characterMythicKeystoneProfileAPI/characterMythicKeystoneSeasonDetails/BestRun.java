package com.kryptonn.jba.model.profile.wow.character.characterMythicKeystoneProfileAPI.characterMythicKeystoneSeasonDetails;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class BestRun {
    @JsonProperty("completed_timestamp")
    private Long completedTimestamp;
    private Long duration;
    @JsonProperty("keystone_level")
    private Long keystoneLevel;
    @JsonProperty("keystone_affixes")
    private List<RealmClass> keystoneAffixes;
    private List<Member> members;
    private RealmClass dungeon;
    @JsonProperty("is_completed_within_time")
    private Boolean isCompletedWithinTime;
    @JsonProperty("mythic_rating")
    private MythicRating mythicRating;
}
