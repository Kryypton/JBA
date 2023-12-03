package com.kryptonn.jba.model.data.wow.HeirloomAPI.base;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.KeyID;
import com.kryptonn.jba.model.base.KeyNameID;
import com.kryptonn.jba.model.base.TypeName;

public record Item(KeyID item, Integer context, List<Integer> bonusLists, TypeName quality, String name, KeyID media) {
  @JsonProperty("item_class")
  private static KeyNameID itemClass;
  @JsonProperty("item_subclass")
  private static KeyNameID itemSubclass;
  @JsonProperty("inventory_type")
  private static TypeName inventoryType;
  @JsonProperty("binding")
  private static TypeName binding;
}
