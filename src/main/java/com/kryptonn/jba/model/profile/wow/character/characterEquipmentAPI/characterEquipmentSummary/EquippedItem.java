package com.kryptonn.jba.model.profile.wow.character.characterEquipmentAPI.characterEquipmentSummary;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class EquippedItem {
    private MediaClass item;
    private List<Enchantment> enchantments;
    private Binding slot;
    private Long quantity;
    private Long context;
    @JsonProperty("bonus_list")
    private List<Long> bonusList;
    private Binding quality;
    private String name;
    @JsonProperty("modified_qppearance_id")
    private Long modifiedAppearanceID;
    private MediaClass media;
    @JsonProperty("item_class")
    private Character itemClass;
    @JsonProperty("item_subclass")
    private Character itemSubclass;
    @JsonProperty("inventory_type")
    private Binding inventoryType;
    private Binding binding;
    private Armor armor;
    private List<Stat> stats;
    @JsonProperty("sell_price")
    private SellPrice sellPrice;
    private Requirements requirements;
    private Set set;
    private Durability level;
    private Transmog transmog;
    private Durability durability;
    @JsonProperty("name_description")
    private NameDescription nameDescription;
    private List<Socket> sockets;
    @JsonProperty("is_subclass_hidden")
    private Boolean isSubclassHidden;
    @JsonProperty("unique_equipped")
    private String uniqueEquipped;
    private List<Spell> spells;
    private Weapon weapon;
    @JsonProperty("shield_block")
    private Armor shieldBlock;
    private String description;
}
