package com.kryptonn.jba.model.profile.wow.character.characterEncountersAPI.characterDungeons;

import java.util.List;

@lombok.Data
public class Instance {
    private InstanceClass instance;
    private List<Mode> modes;
}
