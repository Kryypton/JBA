package com.kryptonn.jba.model.profile.wow.character.characterProfileAPI.characterProfileSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class ActiveSpec {
    private Achievements key;
    private String name;
    private Long id;
    @JsonProperty("display_string")
    private String displayString;
    private String slug;
}
