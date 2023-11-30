package com.kryptonn.jba.model.data.wow.covenantAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.IdTierSpellTooltip;
import com.kryptonn.jba.model.base.KeyNameID;
import com.kryptonn.jba.model.base.Links;
import com.kryptonn.jba.model.base.TypeName;

public record SoulbindConduit(Integer id, String name, KeyNameID item, List<IdTierSpellTooltip> ranks) {
    @JsonProperty("_links")
    private static Links links;
    @JsonProperty("socket_type")
    private static TypeName socketType;
    
}
