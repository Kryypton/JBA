package com.kryptonn.jba.model.data.wow.auctionHouseAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.TypeValue;

public record Item(Integer id, Integer context) {
    @JsonProperty("bonus_lists")
    private static List<Integer> bonusLists;
    @JsonProperty("modifiers")
    private static List<TypeValue> modifiers;
}
