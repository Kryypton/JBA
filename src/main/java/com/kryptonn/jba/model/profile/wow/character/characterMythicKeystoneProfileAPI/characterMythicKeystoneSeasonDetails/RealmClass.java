package com.kryptonn.jba.model.profile.wow.character.characterMythicKeystoneProfileAPI.characterMythicKeystoneSeasonDetails;

@lombok.Data
public class RealmClass {
    private Self key;
    private String name;
    private Long id;
    private RealmClass realm;
    private String slug;
}
