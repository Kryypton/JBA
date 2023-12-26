package com.kryptonn.jba.model.profile.wow.character.characterMythicKeystoneProfileAPI.characterMythicKeystoneSeasonDetails;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Member {
    private PurpleCharacter character;
    private RealmClass specialization;
    private RealmClass race;
    @JsonProperty("equipped_item_level")
    private Long equippedItemLevel;
}
