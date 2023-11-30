package com.kryptonn.jba.model.data.wow.realmAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.Links;
import com.kryptonn.jba.model.base.TypeName;
import com.kryptonn.jba.model.base.KeyNameID;

public record Realm(Integer Id, KeyNameID region, String name, String category, String locale, String timezone, TypeName type, String slug) {
    @JsonProperty("_links")
    private static Links links;
    @JsonProperty("connected_realm")
    private static Links connectedRealm;
    @JsonProperty("is_tournament")
    private static Boolean isTournament;
}
