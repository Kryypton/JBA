package com.kryptonn.jba.model.profile.wow.character.characterEncountersAPI.characterRaids;

import java.util.List;

@lombok.Data
public class Expansion {
    private Character expansion;
    private List<Instance> instances;
}
