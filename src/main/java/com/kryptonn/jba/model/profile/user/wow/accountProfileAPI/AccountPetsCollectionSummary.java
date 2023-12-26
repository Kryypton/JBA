package com.kryptonn.jba.model.profile.user.wow.accountProfileAPI;

import java.util.List;

import com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountPetsCollectionSummary.Links;
import com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountPetsCollectionSummary.Pet;
import com.fasterxml.jackson.annotation.JsonProperty;
@lombok.Data
public class AccountPetsCollectionSummary {
    @JsonProperty("_links")
    private Links links;
    private List<Pet> pets;
    @JsonProperty("unlocked_battle_pet_Slots")
    private Long unlockedBattlePetSlots;
}
