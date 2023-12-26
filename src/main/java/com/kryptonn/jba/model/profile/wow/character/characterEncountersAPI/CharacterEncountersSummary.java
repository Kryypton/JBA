package com.kryptonn.jba.model.profile.wow.character.characterEncountersAPI;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.profile.wow.character.characterEncountersAPI.characterEncountersSummary.Character;
import com.kryptonn.jba.model.profile.wow.character.characterEncountersAPI.characterEncountersSummary.Dungeons;
import com.kryptonn.jba.model.profile.wow.character.characterEncountersAPI.characterEncountersSummary.Links;

@lombok.Data
public class CharacterEncountersSummary {
    @JsonProperty("_links")
    private Links links;
    private Character character;
    private Dungeons dungeons;
    private Dungeons raids;
}
