package com.kryptonn.jba.model.profile.wow.character.characterAchievementsAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.profile.wow.character.characterAchievementsAPI.characterAchievementsSummary.Achievement;
import com.kryptonn.jba.model.profile.wow.character.characterAchievementsAPI.characterAchievementsSummary.CategoryProgress;
import com.kryptonn.jba.model.profile.wow.character.characterAchievementsAPI.characterAchievementsSummary.Links;
import com.kryptonn.jba.model.profile.wow.character.characterAchievementsAPI.characterAchievementsSummary.RecentEvent;
import com.kryptonn.jba.model.profile.wow.character.characterAchievementsAPI.characterAchievementsSummary.Statistics;


@lombok.Data
public class CharacterAchievementsSummary {
    @JsonProperty("_links")
    private Links links;
    @JsonProperty("total_quantity")
    private Long totalQuantity;
    @JsonProperty("total_points")
    private Long totalPoints;
    private List<Achievement> achievements;
    @JsonProperty("category_progress")
    private List<CategoryProgress> categoryProgress;
    @JsonProperty("recent_events")
    private List<RecentEvent> recentEvents;
    private Character character;
    private Statistics statistics;
}
