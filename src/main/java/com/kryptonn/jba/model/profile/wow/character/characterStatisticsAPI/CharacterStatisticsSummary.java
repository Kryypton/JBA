package com.kryptonn.jba.model.profile.wow.character.characterStatisticsAPI;

import com.kryptonn.jba.model.profile.wow.character.characterStatisticsAPI.characterStatisticsSummary.*;
import com.kryptonn.jba.model.profile.wow.character.characterStatisticsAPI.characterStatisticsSummary.Character;
import com.fasterxml.jackson.annotation.JsonProperty;
@lombok.Data
public class CharacterStatisticsSummary {
    @JsonProperty("_links")
    private Links links;
    private Long health;
    private Long power;
    @JsonProperty("power_type")
    private Character powerType;
    private Avoidance speed;
    private Agility strength;
    private Agility agility;
    private Agility intellect;
    private Agility stamina;
    @JsonProperty("melee_crit")
    private Block meleeCrit;
    @JsonProperty("melee_haste")
    private Block meleeHaste;
    private Block mastery;
    @JsonProperty("bonus_armor")
    private Long bonusArmor;
    private Block lifesteal;
    private Long versatility;
    @JsonProperty("versatility_damage_done_bonus")
    private Double versatilityDamageDoneBonus;
    @JsonProperty("versatility_healing_done_bonus")
    private Double versatilityHealingDoneBonus;
    @JsonProperty("versatility_damage_taken_bonus")
    private Double versatilityDamageTakenBonus;
    private Avoidance avoidance;
    @JsonProperty("attack_power")
    private Long attackPower;
    @JsonProperty("main_hand_damage_min")
    private Double mainHandDamageMin;
    @JsonProperty("main_hand_damage_max")
    private Double mainHandDamageMax;
    @JsonProperty("main_hand_speed")
    private Double mainHandSpeed;
    @JsonProperty("main_hand_dps")
    private Double mainHandDps;
    @JsonProperty("off_hand_damage_min")
    private Long offHandDamageMin;
    @JsonProperty("off_hand_damage_max")
    private Long offHandDamageMax;
    @JsonProperty("off_hand_speed")
    private Double offHandSpeed;
    @JsonProperty("off_hand_dps")
    private Long offHandDps;
    @JsonProperty("spell_power")
    private Long spellPower;
    @JsonProperty("spell_penetration")
    private Long spellPenetration;
    @JsonProperty("spell_crit")
    private Block spellCrit;
    @JsonProperty("mana_regen")
    private Long manaRegen;
    @JsonProperty("mana_regen_combat")
    private Long manaRegenCombat;
    private Agility armor;
    private Block dodge;
    private Block parry;
    private Block block;
    @JsonProperty("ranged_crit")
    private Block rangedCrit;
    @JsonProperty("ranged_haste")
    private Block rangedHaste;
    @JsonProperty("spell_haste")
    private Block spellHaste;
    private Character character;
}
