package com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountProfileSummary;

import java.util.List;

@lombok.Data
public class WowAccount {
    private Long id;
    private List<Character> characters;
}
