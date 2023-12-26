package com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountProfileSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Character {
    private Collections character;
    @JsonProperty("protected_character")
    private Collections protectedCharacter;
    private String name;
    private Long id;
    private PlayableClass realm;
    @JsonProperty("playable_character")
    private PlayableClass playableClass;
    @JsonProperty("playable_race")
    private PlayableClass playableRace;
    private Faction gender;
    private Faction faction;
    private Long level;
}
