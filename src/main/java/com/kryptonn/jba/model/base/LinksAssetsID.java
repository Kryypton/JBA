package com.kryptonn.jba.model.base;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public record LinksAssetsID(List<KeyValue> assets, Integer id) {
    @JsonProperty("_links") 
    private static Links links;
}
