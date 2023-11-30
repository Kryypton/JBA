package com.kryptonn.jba.model.data.wow.covenantAPI.base;

import com.kryptonn.jba.model.base.KeyNameID;

public record SpellTooltip(KeyNameID spell, String description, String castTime, String cooldown) {
}
