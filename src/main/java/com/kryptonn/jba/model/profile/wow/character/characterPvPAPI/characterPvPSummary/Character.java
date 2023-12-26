package com.kryptonn.jba.model.profile.wow.character.characterPvPAPI.characterPvPSummary;

@lombok.Data
public class Character {
    private Bracket key;
    private String name;
    private Long id;
    private Character realm;
    private String slug;
}
