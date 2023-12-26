package com.kryptonn.jba.model.profile.wow.character.characterEquipmentAPI;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.profile.wow.character.characterEquipmentAPI.characterEquipmentSummary.Character;
import com.kryptonn.jba.model.profile.wow.character.characterEquipmentAPI.characterEquipmentSummary.*;

@lombok.Data
public class CharacterEquipmentSummary {
    @JsonProperty("_links")
    private Links links;
    private Character character;
    @JsonProperty("equipped_items")
    private List<EquippedItem> equippedItems;
    @JsonProperty("equipped_item_sets")
    private List<Set> equippedItemSets;
}
