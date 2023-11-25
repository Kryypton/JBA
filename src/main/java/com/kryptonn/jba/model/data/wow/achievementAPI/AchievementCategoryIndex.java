package com.kryptonn.jba.model.data.wow.achievementAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.Category;
import com.kryptonn.jba.model.base.Links;

public record AchievementCategoryIndex(List<Category> categories) {
    @JsonProperty("_links")
    private static Links links;
}