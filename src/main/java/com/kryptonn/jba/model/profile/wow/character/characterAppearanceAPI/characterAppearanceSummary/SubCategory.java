package com.kryptonn.jba.model.profile.wow.character.characterAppearanceAPI.characterAppearanceSummary;

import java.util.List;

@lombok.Data
public class SubCategory {
    private Long id;
    private String name;
    private List<SubCategoryStatistic> statistics;
}
