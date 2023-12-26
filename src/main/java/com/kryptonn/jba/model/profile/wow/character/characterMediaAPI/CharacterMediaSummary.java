package com.kryptonn.jba.model.profile.wow.character.characterMediaAPI;

import java.util.List;
import com.kryptonn.jba.model.profile.wow.character.characterMediaAPI.characterMediaSummary.Character;
import com.kryptonn.jba.model.profile.wow.character.characterMediaAPI.characterMediaSummary.*;
import com.fasterxml.jackson.annotation.JsonProperty;
@lombok.Data
public class CharacterMediaSummary {
    @JsonProperty("_links")
    private Links links;
    private Character character;
    private List<Asset> assets;
}
