package com.kryptonn.jba.model.profile.wow.character.characterSoulbindsAPI.characterSoulbinds;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Trait {
    private Character trait;
    private Long tier;
    @JsonProperty("display_order")
    private Long displayOrder;
    @JsonProperty("conduit_socket")
    private ConduitSocket conduitSocket;
}
