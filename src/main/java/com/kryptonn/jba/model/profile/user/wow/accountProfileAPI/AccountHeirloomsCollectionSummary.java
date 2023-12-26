package com.kryptonn.jba.model.profile.user.wow.accountProfileAPI;

import java.util.List;

import com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountHeirloomsCollectionSummary.HeirloomElement;
import com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountHeirloomsCollectionSummary.Links;
import com.fasterxml.jackson.annotation.JsonProperty;
@lombok.Data
public class AccountHeirloomsCollectionSummary {
    @JsonProperty("_links")
    private Links links;
    private List<HeirloomElement> heirlooms;
}
