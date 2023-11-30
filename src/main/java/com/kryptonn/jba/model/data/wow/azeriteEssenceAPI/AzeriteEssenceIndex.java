package com.kryptonn.jba.model.data.wow.azeriteEssenceAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.KeyNameID;
import com.kryptonn.jba.model.base.Links;

public record AzeriteEssenceIndex() {
    @JsonProperty("_links")
    private static Links links;
    @JsonProperty("azerite_essences")
    private static List<KeyNameID> azeriteEssences;
}
