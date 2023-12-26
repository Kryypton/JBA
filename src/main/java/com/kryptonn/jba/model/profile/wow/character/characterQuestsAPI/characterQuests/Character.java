package com.kryptonn.jba.model.profile.wow.character.characterQuestsAPI.characterQuests;

@lombok.Data
public class Character {
    private Completed key;
    private String name;
    private Long id;
    private Character realm;
    private String slug;
}
