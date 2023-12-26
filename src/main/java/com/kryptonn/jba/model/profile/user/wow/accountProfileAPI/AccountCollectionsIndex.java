package com.kryptonn.jba.model.profile.user.wow.accountProfileAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountCollectionsIndex.Heirlooms;
import com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountCollectionsIndex.Links;

@lombok.Data
public class AccountCollectionsIndex {
    @JsonProperty("_links")
    private Links links;
    private Heirlooms pets;
    private Heirlooms mounts;
    private Heirlooms heirlooms;
    private Heirlooms toys;
    private Heirlooms transmogs;
}
