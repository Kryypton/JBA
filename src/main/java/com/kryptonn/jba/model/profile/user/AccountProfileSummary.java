package com.kryptonn.jba.model.profile.user;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.Link;
import com.kryptonn.jba.model.base.Links;
import com.kryptonn.jba.model.profile.user.base.WowAccount;

public record AccountProfileSummary(Link collections, @JsonProperty("_links") Links link, @JsonProperty("wow_accounts") private static List<WowAccount> wowAccounts) {
}

