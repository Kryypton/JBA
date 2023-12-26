package com.kryptonn.jba.model.profile.user.wow.accountProfileAPI;

import java.util.List;

import com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountProfileSummary.Collections;
import com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountProfileSummary.Links;
import com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountProfileSummary.WowAccount;

import com.fasterxml.jackson.annotation.JsonProperty;
@lombok.Data
public class AccountProfileSummary {
    @JsonProperty("_links")
    private Links links;
    private Long id;
    @JsonProperty("wow_accounts")
    private List<WowAccount> wowAccounts;
    private Collections collections;
}
