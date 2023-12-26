package com.kryptonn.jba.model.profile.wow.character.characterAchievementsAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.kryptonn.jba.model.profile.wow.character.characterAchievementsAPI.characterAchievementStatistics.Category;
import com.kryptonn.jba.model.profile.wow.character.characterAchievementsAPI.characterAchievementStatistics.Links;

@lombok.Data
public class CharacterAchievementStatistics {
    @JsonProperty("_links")
    private Links links;
    private Character character;
    private List<Category> categories;
}
