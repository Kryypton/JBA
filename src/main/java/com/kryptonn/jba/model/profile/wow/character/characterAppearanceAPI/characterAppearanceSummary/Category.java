package com.kryptonn.jba.model.profile.wow.character.characterAppearanceAPI.characterAppearanceSummary;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Category {
    private Long id;
    private String name;
    @JsonProperty("sub_categories")
    private List<SubCategory> subCategories;
    private List<CategoryStatistic> statistics;
}
