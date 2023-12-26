package com.kryptonn.jba.model.profile.wow.character.characterQuestsAPI;

import com.kryptonn.jba.model.profile.wow.character.characterQuestsAPI.characterQuests.*;
import com.kryptonn.jba.model.profile.wow.character.characterQuestsAPI.characterQuests.Character;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@lombok.Data
public class CharacterQuests {
    @JsonProperty("_links")
    private Links links;
    private Character character;
    @JsonProperty("in_progress")
    private List<Character> inProgress;
    private Completed completed;
}
