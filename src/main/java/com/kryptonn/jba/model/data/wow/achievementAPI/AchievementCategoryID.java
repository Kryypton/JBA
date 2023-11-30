package com.kryptonn.jba.model.data.wow.achievementAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.KeyNameID;
import com.kryptonn.jba.model.base.Faction;
import com.kryptonn.jba.model.base.Links;

import java.util.List;

public record AchievementCategoryID(Integer id, String name, List<KeyNameID> achievements, List<KeyNameID> subcategories) {
    @JsonProperty("_links")
    private static Links links;
    @JsonProperty("is_guild_category")
    private static Boolean isGuildCategory;
    @JsonProperty("aggregates_by_faction")
    private static Faction aggregatesByFaction;
    @JsonProperty("display_order")
    private static Integer displayOrder;
}
