package com.kryptonn.jba.model.profile.wow.character.characterSoulbindsAPI.characterSoulbinds;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Soulbind {
    private Character soulbind;
    private List<Trait> traits;
    @JsonProperty("is_active")
    private Boolean isActive;
}
