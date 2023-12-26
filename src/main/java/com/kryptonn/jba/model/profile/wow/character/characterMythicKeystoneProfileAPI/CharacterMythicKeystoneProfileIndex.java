package com.kryptonn.jba.model.profile.wow.character.characterMythicKeystoneProfileAPI;

import java.util.List;
import com.kryptonn.jba.model.profile.wow.character.characterMythicKeystoneProfileAPI.characterMythicKeystoneProfileIndex.*;
import com.kryptonn.jba.model.profile.wow.character.characterMythicKeystoneProfileAPI.characterMythicKeystoneProfileIndex.Character;
import com.fasterxml.jackson.annotation.JsonProperty;
@lombok.Data
public class CharacterMythicKeystoneProfileIndex {
    @JsonProperty("_links")
    private Links links;
    @JsonProperty("current_period")
    private CurrentPeriod currentPeriod;
    private List<Season> seasons;
    private Character character;
    @JsonProperty("current_mythic_rating")
    private CurrentMythicRating currentMythicRating;
}
