package com.kryptonn.jba.model.profile.wow.character.characterAppearanceAPI.characterAppearanceSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class CategoryStatistic {
    private Long id;
    private String name;
    @JsonProperty("last_updated_timestamp")
    private Long lastUpdatedTimestamp;
    private QuantityUnion quantity;
    private String description;
}
