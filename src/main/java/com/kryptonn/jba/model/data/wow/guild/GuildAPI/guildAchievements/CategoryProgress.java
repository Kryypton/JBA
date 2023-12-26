package com.kryptonn.jba.model.data.wow.guild.GuildAPI.guildAchievements;

@lombok.Data
public class CategoryProgress {
    private Realm category;
    private Long quantity;
    private Long points;
}
