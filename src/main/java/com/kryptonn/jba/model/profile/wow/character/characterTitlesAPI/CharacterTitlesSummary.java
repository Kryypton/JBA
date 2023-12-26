package com.kryptonn.jba.model.profile.wow.character.characterTitlesAPI;

import java.util.List;
import com.kryptonn.jba.model.profile.wow.character.characterTitlesAPI.characterTitlesSummary.*;
import com.fasterxml.jackson.annotation.JsonProperty;
@lombok.Data
public class CharacterTitlesSummary {
    @JsonProperty("_links")
    private Links links;
    private ActiveTitle character;
    @JsonProperty("active_title")
    private ActiveTitle activeTitle;
    private List<ActiveTitle> titles;
}
