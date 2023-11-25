package com.kryptonn.jba.model.data.wow.achievementAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.Category;
import com.kryptonn.jba.model.base.IdDescriptionAmount;
import com.kryptonn.jba.model.base.KeyID;
import com.kryptonn.jba.model.base.Links;

public record AchievementID(Integer id, Category category, String name, String description, Integer points, IdDescriptionAmount criteria, KeyID media ) {
    @JsonProperty("_links")
    private static Links links;
    @JsonProperty("is_account_wide")
    private static Boolean isAccountWide;
    @JsonProperty("next_achievement")
    private static KeyID nextAchievement;
    @JsonProperty("display_order")
    private static Integer displayOrder;
}
