package com.kryptonn.jba.model.profile.wow.character.characterQuestsAPI;

import java.util.List;

import com.kryptonn.jba.model.profile.wow.character.characterQuestsAPI.characterCompletedQuests.*;
import com.kryptonn.jba.model.profile.wow.character.characterQuestsAPI.characterCompletedQuests.Character;
import com.fasterxml.jackson.annotation.JsonProperty;
@lombok.Data
public class CharacterCompletedQuests {
    @JsonProperty("_links")
    private Links links;
    private Character character;
    private List<Character> quests;
}
