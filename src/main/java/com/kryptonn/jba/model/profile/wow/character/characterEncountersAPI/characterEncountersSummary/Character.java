package com.kryptonn.jba.model.profile.wow.character.characterEncountersAPI.characterEncountersSummary;

@lombok.Data
public class Character {
    private Dungeons key;
    private String name;
    private Long id;
    private Character realm;
    private String slug;
}
