package com.kryptonn.jba.model.data.wow.covenantAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.KeyNameID;
import com.kryptonn.jba.model.base.Links;

public record SoulbindConduitIndex(List<KeyNameID> conduits) {
    @JsonProperty("_links")
    private static Links links;
}
