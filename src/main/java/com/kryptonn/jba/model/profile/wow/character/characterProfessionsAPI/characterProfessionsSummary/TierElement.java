package com.kryptonn.jba.model.profile.wow.character.characterProfessionsAPI.characterProfessionsSummary;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class TierElement {
    @JsonProperty("skill_points")
    private Long skillPoints;
    @JsonProperty("max_skill_points")
    private Long maxSkillPoints;
    private TierTier tier;
    @JsonProperty("known_recipes")
    private List<Character> knownRecipes;
}
