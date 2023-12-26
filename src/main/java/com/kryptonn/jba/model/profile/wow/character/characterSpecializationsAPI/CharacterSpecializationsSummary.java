package com.kryptonn.jba.model.profile.wow.character.characterSpecializationsAPI;

import java.util.List;
import com.kryptonn.jba.model.profile.wow.character.characterSpecializationsAPI.characterSpecializationsSummary.*;
import com.fasterxml.jackson.annotation.JsonProperty;
@lombok.Data
public class CharacterSpecializationsSummary {
    @JsonProperty("_links")
    private Links links;
    private List<Specialization> specializations;
    @JsonProperty("active_specialization")
    private ActiveSpecialization activeSpecialization;
    private ActiveSpecialization character;
}
