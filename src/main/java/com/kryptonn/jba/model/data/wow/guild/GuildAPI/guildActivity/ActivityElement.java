package com.kryptonn.jba.model.data.wow.guild.GuildAPI.guildActivity;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class ActivityElement {
    @JsonProperty("character_achievement")
    private CharacterAchievement characterAchievement;
    private ActivityActivity activity;
    private Long timestamp;
    @JsonProperty("encounter_completed")
    private EncounterCompleted encounterCompleted;
}
