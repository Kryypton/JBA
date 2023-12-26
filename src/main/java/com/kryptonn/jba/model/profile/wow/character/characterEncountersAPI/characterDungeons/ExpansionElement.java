package com.kryptonn.jba.model.profile.wow.character.characterEncountersAPI.characterDungeons;

import java.util.List;

@lombok.Data
public class ExpansionElement {
    private InstanceClass expansion;
    private List<Instance> instances;
}
