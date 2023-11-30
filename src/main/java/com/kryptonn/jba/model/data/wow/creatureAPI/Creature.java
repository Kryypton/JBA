package com.kryptonn.jba.model.data.wow.creatureAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.KeyID;
import com.kryptonn.jba.model.base.KeyNameID;
import com.kryptonn.jba.model.base.Links;

public record Creature(Integer id, String name, KeyNameID type, KeyNameID family) {
    @JsonProperty("_links")
    private static Links links;
    @JsonProperty("creature_display")
    private static List<KeyID> creatureDisplay;
    @JsonProperty("is_tameable")
    private static Boolean isTameable;
}
