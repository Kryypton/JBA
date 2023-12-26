package com.kryptonn.jba.model.profile.wow.character.characterSoulbindsAPI.characterSoulbinds;

@lombok.Data
public class Character {
    private Self key;
    private String name;
    private Long id;
    private Character realm;
    private String slug;
}
