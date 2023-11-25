package com.kryptonn.jba.model.base;

import com.fasterxml.jackson.annotation.JsonProperty;

public record KeyValueFiledataid(String key, String value) {
    @JsonProperty("file_data_id")
    private static Integer fileDataId;
}
