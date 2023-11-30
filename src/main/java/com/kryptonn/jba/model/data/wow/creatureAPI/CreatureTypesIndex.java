package com.kryptonn.jba.model.data.wow.creatureAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.KeyNameID;
import com.kryptonn.jba.model.base.Links;

public record CreatureTypesIndex() {
    @JsonProperty("_links")
    private static Links links;
    @JsonProperty("creature_types")
    private static List<KeyNameID> creatureTypes;
}
