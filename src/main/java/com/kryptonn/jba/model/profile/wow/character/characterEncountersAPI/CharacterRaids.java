package com.kryptonn.jba.model.profile.wow.character.characterEncountersAPI;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.profile.wow.character.characterEncountersAPI.characterRaids.Expansion;
import com.kryptonn.jba.model.profile.wow.character.characterEncountersAPI.characterRaids.Links;

@lombok.Data
public class CharacterRaids {
    @JsonProperty("_links")
    private Links links;
    private Character character;
    private List<Expansion> expansions;
}
