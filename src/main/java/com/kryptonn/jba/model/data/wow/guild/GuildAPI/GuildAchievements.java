package com.kryptonn.jba.model.data.wow.guild.GuildAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.data.wow.guild.GuildAPI.guildAchievements.*;

@lombok.Data
public class GuildAchievements {
    @JsonProperty("_links")
    private Links links;
    private Guild guild;
    @JsonProperty("total_quantity")
    private Long totalQuantity;
    @JsonProperty("total_points")
    private Long totalPoints;
    private List<Achievement> achievements;
    @JsonProperty("category_progress")
    private List<CategoryProgress> categoryProgress;
    @JsonProperty("recent_events")
    private List<RecentEvent> recentEvents;
}
