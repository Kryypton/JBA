package com.kryptonn.jba.model.profile.wow.character.characterAchievementsAPI.characterAchievementStatistics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuantityUnion {
    @JsonProperty("integer_value")
    public Long integerValue;
    @JsonProperty("quantity_class_value")
    public QuantityClass quantityClassValue;
}
