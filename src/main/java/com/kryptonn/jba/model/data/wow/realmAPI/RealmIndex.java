package com.kryptonn.jba.model.data.wow.realmAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.Links;
import com.kryptonn.jba.model.base.KeyNameIdSlug;

public record RealmIndex(List<KeyNameIdSlug> realms) {
    @JsonProperty("_links")
    private static Links links;
}
