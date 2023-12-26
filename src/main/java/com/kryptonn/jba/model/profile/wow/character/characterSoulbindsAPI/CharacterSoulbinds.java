package com.kryptonn.jba.model.profile.wow.character.characterSoulbindsAPI;

import java.util.List;
import com.kryptonn.jba.model.profile.wow.character.characterSoulbindsAPI.characterSoulbinds.*;
import com.kryptonn.jba.model.profile.wow.character.characterSoulbindsAPI.characterSoulbinds.Character;
import com.fasterxml.jackson.annotation.JsonProperty;
@lombok.Data
public class CharacterSoulbinds {
    @JsonProperty("_links")
    private Links links;
    private Character character;
    @JsonProperty("chosen_covenant")
    private Character chosenCovenant;
    @JsonProperty("renown_level")
    private Long renownLevel;
    private List<Soulbind> soulbinds;
}
