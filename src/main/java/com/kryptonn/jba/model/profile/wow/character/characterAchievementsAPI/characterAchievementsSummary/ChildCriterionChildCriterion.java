package com.kryptonn.jba.model.profile.wow.character.characterAchievementsAPI.characterAchievementsSummary;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class ChildCriterionChildCriterion {
    private Long id;
    private Long amount;
    @JsonProperty("is_completed")
    private Boolean isCompleted;
    @JsonProperty("child_criteria")
    private List<ChildCriterionChildCriterion> childCriteria;
}
