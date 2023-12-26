package com.kryptonn.jba.model.profile.wow.character.characterProfileAPI.characterProfileSummary;

@lombok.Data
public class Guild {
    private Achievements key;
    private String name;
    private Long id;
    private ActiveSpec realm;
    private Faction faction;
}
