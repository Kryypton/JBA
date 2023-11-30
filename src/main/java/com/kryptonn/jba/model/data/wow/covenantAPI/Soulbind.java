package com.kryptonn.jba.model.data.wow.covenantAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.KeyNameID;
import com.kryptonn.jba.model.base.Links;
import com.kryptonn.jba.model.base.NameID;

public record Soulbind(Integer id, String name, KeyNameID covenant, KeyNameID creature, NameID follower) {
    @JsonProperty("_links")
    private static Links links;
    @JsonProperty("talent_tree")
    private static KeyNameID talentTree;
}
