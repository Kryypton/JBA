package com.kryptonn.jba.model.data.wow.creatureAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.KeyID;
import com.kryptonn.jba.model.base.KeyNameID;
import com.kryptonn.jba.model.base.Links;

public record CreatureFamily(KeyNameID specialization, KeyID media) {
    @JsonProperty("_links")
    private static Links links;
}
