package com.kryptonn.jba.model.profile.user.wow.accountProfileAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountCollectionsIndex.Links;
import com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountMountsCollectionSummary.MountElement;

@lombok.Data
public class AccountMountsCollectionSummary {
    @JsonProperty("_links")
    private Links links;
    private List<MountElement> mounts;
}
