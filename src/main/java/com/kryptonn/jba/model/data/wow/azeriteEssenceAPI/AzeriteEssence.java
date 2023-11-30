package com.kryptonn.jba.model.data.wow.azeriteEssenceAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.IdRankMainpowerspellpassivepowerspell;
import com.kryptonn.jba.model.base.KeyID;
import com.kryptonn.jba.model.base.KeyNameID;
import com.kryptonn.jba.model.base.Links;

public record AzeriteEssence(Integer id, String name, List<IdRankMainpowerspellpassivepowerspell> powers, KeyID media) {
    @JsonProperty("_links")
    private static Links links;
    @JsonProperty("allowed_specializations")
    private static List<KeyNameID> allowedSpecializations;
}
