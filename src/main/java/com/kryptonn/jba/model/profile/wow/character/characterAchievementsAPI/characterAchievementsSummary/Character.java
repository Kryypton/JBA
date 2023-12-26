package com.kryptonn.jba.model.profile.wow.character.characterAchievementsAPI.characterAchievementsSummary;

@lombok.Data
public class Character {
    private Statistics key;
    private String name;
    private Long id;
    private Character realm;
    private String slug;
}
