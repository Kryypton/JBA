package com.kryptonn.jba.model.data.wow.guild.GuildAPI.guildRoster;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Character {
    private Self key;
    private String name;
    private Long id;
    private Realm realm;
    private Long level;
    @JsonProperty("playable_class")
    private Playable playableClass;
    @JsonProperty("playable_race")
    private Playable playableRace;
}
