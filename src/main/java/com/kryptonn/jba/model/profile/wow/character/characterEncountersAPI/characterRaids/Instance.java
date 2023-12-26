package com.kryptonn.jba.model.profile.wow.character.characterEncountersAPI.characterRaids;

import java.util.List;

@lombok.Data
public class Instance {
    private Character instance;
    private List<Mode> modes;
}
