package com.kryptonn.jba.model.profile.wow.character.characterReputationsAPI;

import java.util.List;
import com.kryptonn.jba.model.profile.wow.character.characterReputationsAPI.characterReputationsSummary.*;
import com.kryptonn.jba.model.profile.wow.character.characterReputationsAPI.characterReputationsSummary.Character;

import com.fasterxml.jackson.annotation.JsonProperty;
@lombok.Data
public class CharacterReputationsSummary {
    @JsonProperty("_links")
    private Links links;
    private Character character;
    private List<Reputation> reputations;
}
