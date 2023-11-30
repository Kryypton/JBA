package com.kryptonn.jba.model.data.wow.covenantAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.KeyID;
import com.kryptonn.jba.model.base.KeyNameID;
import com.kryptonn.jba.model.base.Links;
import com.kryptonn.jba.model.data.wow.covenantAPI.base.ClassAbilities;
import com.kryptonn.jba.model.data.wow.covenantAPI.base.RenownRewards;
import com.kryptonn.jba.model.data.wow.covenantAPI.base.SignatureAbility;

public record Covenant(String id, String name, String description, List<KeyNameID> soulbinds, KeyID media) {
    @JsonProperty("_links")
    private static Links links;
    @JsonProperty("signature_ability")
    private static SignatureAbility signatureAbility;
    @JsonProperty("class_abilities")
    private static List<ClassAbilities> classAbilities;
    @JsonProperty("renown_rewards")
    private static List<RenownRewards> renownRewards;
}
