package com.kryptonn.jba.model.profile.user.wow.accountProfileAPI;

import java.util.List;

import com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountToysCollectionSummary.Links;
import com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountToysCollectionSummary.ToyElement;
import com.fasterxml.jackson.annotation.JsonProperty;
@lombok.Data
public class AccountToysCollectionSummary {
    @JsonProperty("_links")
    private Links links;
    private List<ToyElement> toys;
}
