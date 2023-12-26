package com.kryptonn.jba.model.profile.wow.character.characterEquipmentAPI.characterEquipmentSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Socket {
    @JsonProperty("socket_type")
    private Binding socketType;
    private Character item;
    @JsonProperty("display_string")
    private String displayString;
    private MediaClass media;
}
