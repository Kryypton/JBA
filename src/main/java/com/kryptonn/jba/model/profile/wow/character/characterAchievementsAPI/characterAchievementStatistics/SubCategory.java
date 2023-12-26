package com.kryptonn.jba.model.profile.wow.character.characterAchievementsAPI.characterAchievementStatistics;

import java.util.List;

@lombok.Data
public class SubCategory {
    private Long id;
    private String name;
    private List<SubCategoryStatistic> statistics;
}
