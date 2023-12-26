package com.kryptonn.jba.model.profile.user.wow.accountProfileAPI;

import com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountProfileSummary.Links;
import com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.protectedCharacterProfileSummary.Position;
import com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.protectedCharacterProfileSummary.ProtectedStats;
import com.fasterxml.jackson.annotation.JsonProperty;
@lombok.Data
public class ProtectedCharacterProfileSummary {
    @JsonProperty("_links")
    private Links links;
    private Long id;
    private String name;
    private Long money;
    private Character character;
    @JsonProperty("protected_stats")
    private ProtectedStats protectedStats;
    private Position position;
    @JsonProperty("bind_position")
    private Position bindPosition;
    @JsonProperty("wow_account")
    private Long wowAccount;
}
