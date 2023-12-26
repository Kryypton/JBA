package com.kryptonn.jba.model.profile.wow.character.characterProfessionsAPI.characterProfessionsSummary;

import java.util.List;

@lombok.Data
public class Primary {
    private Character profession;
    private List<TierElement> tiers;
}
