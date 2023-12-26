package com.kryptonn.jba.model.profile.wow.character.characterTitlesAPI.characterTitlesSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class ActiveTitle {
    private Self key;
    private String name;
    private Long id;
    @JsonProperty("display_string")
    private String displayString;
    private ActiveTitle realm;
    private String slug;
}
