package com.kryptonn.jba.model.data.wow.auctionHouseAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.IdItemByoutQuantityTimeleft;
import com.kryptonn.jba.model.base.Links;

public record Auctions(List<IdItemByoutQuantityTimeleft> auctions) {
    @JsonProperty("_links")
    private static Links links;
    @JsonProperty("connected_realm")
    private static Links connectedRealm;
}
