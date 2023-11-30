package com.kryptonn.jba.model.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.data.wow.auctionHouseAPI.Item;

public record IdItemByoutQuantityTimeleft(Integer id, Item item, Integer buyout, Integer quantity) {
    @JsonProperty("time_left")
    private static String timeleft;
}
