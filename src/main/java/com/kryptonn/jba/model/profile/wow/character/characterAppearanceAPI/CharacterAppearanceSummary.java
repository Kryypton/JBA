package com.kryptonn.jba.model.profile.wow.character.characterAppearanceAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.kryptonn.jba.model.profile.wow.character.characterAppearanceAPI.characterAppearanceSummary.Category;
import com.kryptonn.jba.model.profile.wow.character.characterAppearanceAPI.characterAppearanceSummary.Links;

@lombok.Data
public class CharacterAppearanceSummary {
    @JsonProperty("_links")
    private Links links;
    private Character character;
    private List<Category> categories;
}
