package com.kryptonn.jba.model.profile.wow.character.characterCollectionsAPI.characterCollectionsIndex;

@lombok.Data
public class Character {
    private Heirlooms key;
    private String name;
    private Long id;
    private Character realm;
    private String slug;
}
