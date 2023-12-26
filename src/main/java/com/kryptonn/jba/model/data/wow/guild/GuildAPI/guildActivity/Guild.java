package com.kryptonn.jba.model.data.wow.guild.GuildAPI.guildActivity;

@lombok.Data
public class Guild {
    private Self key;
    private String name;
    private Long id;
    private Guild realm;
    private String slug;
    private Faction faction;
}
