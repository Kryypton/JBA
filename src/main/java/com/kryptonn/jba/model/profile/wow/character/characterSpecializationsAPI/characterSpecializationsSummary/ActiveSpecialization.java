package com.kryptonn.jba.model.profile.wow.character.characterSpecializationsAPI.characterSpecializationsSummary;

@lombok.Data
public class ActiveSpecialization {
    private Self key;
    private String name;
    private Long id;
    private ActiveSpecialization realm;
    private String slug;
}
