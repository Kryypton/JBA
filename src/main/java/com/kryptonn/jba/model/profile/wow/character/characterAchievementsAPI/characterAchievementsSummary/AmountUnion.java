package com.kryptonn.jba.model.profile.wow.character.characterAchievementsAPI.characterAchievementsSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AmountUnion {
    @JsonProperty("integer_value")
    public Long integerValue;
    @JsonProperty("amount_class_value")
    public AmountClass amountClassValue;
}
