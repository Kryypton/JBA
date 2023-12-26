package com.kryptonn.jba.model.profile.wow.character.characterProfessionsAPI;

import java.util.List;
import com.kryptonn.jba.model.profile.wow.character.characterProfessionsAPI.characterProfessionsSummary.*;
import com.kryptonn.jba.model.profile.wow.character.characterProfessionsAPI.characterProfessionsSummary.Character;
import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class CharacterProfessionsSummary {
    @JsonProperty("_links")
    private Links links;
    private Character character;
    private List<Primary> primaries;
    private List<Secondary> secondaries;
}
