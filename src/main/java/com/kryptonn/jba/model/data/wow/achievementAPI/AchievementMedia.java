package com.kryptonn.jba.model.data.wow.achievementAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.KeyValueFiledataid;
import com.kryptonn.jba.model.base.Links;

public record AchievementMedia(List<KeyValueFiledataid> assets, Integer id) {
    @JsonProperty("_links")
    private static Links links;
}
