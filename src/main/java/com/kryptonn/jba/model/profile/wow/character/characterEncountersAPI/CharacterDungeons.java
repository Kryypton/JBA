package com.kryptonn.jba.model.profile.wow.character.characterEncountersAPI;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.profile.wow.character.characterEncountersAPI.characterDungeons.ExpansionElement;
import com.kryptonn.jba.model.profile.wow.character.characterEncountersAPI.characterDungeons.Links;

@lombok.Data
public class CharacterDungeons {
    @JsonProperty("_links")
    private Links links;
    private List<ExpansionElement> expansions;
}
