package com.kryptonn.jba.model.profile.wow.character.characterSpecializationsAPI.characterSpecializationsSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class PvpTalentSlot {
    private Selected selected;
    @JsonProperty("slot_number")
    private Long slotNumber;
}
