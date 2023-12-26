package com.kryptonn.jba.model.data.wow.guild.GuildAPI.guildRoster;

@lombok.Data
public class Guild {
    private Self key;
    private String name;
    private Long id;
    private Realm realm;
    private Faction faction;
}
