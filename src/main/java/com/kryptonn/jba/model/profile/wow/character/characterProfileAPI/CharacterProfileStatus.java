package com.kryptonn.jba.model.profile.wow.character.characterProfileAPI;

import com.kryptonn.jba.model.profile.wow.character.characterProfileAPI.characterProfileSummary.Links;
import com.fasterxml.jackson.annotation.JsonProperty;
@lombok.Data
public class CharacterProfileStatus {
    @JsonProperty("_links")
    private Links links;
    private Long id;
    @JsonProperty("is_valid")
    private Boolean isValid;
}
