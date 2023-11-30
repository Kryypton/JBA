package com.kryptonn.jba.model.data.wow.creatureAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.Links;

public record CreatureType(Integer id, String name) {
    @JsonProperty("_links")
    private static Links links;   
}
