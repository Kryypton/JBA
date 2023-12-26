package com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.protectedCharacterProfileSummary;

@lombok.Data
public class Character {
    private Profile key;
    private String name;
    private Long id;
    private Character realm;
    private String slug;
}
