package com.kryptonn.jba.model.data.wow.conectedRealmAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.KeyNameIdSlug;
import com.kryptonn.jba.model.base.Link;
import com.kryptonn.jba.model.base.Links;
import com.kryptonn.jba.model.base.TypeName;

public record ConnectedRealmID(Integer id, TypeName status, TypeName populatio, List<KeyNameIdSlug> realm, Link auctions) {
    @JsonProperty("_links")
    private static Links links;
    @JsonProperty("has_queue")
    private static Boolean hasQueue;
    @JsonProperty("mythic_leaderboards")
    private static Link mythicLeaderboards;
}
