package com.kryptonn.jba.model.data.wow.HeirloomAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.KeyNameID;
import com.kryptonn.jba.model.base.Links;
import com.kryptonn.jba.model.base.TypeName;
import com.kryptonn.jba.model.data.wow.HeirloomAPI.base.Upgrade;

public record Hairlom(Integer id, KeyNameID item, TypeName source) {
  @JsonProperty("_links")
  private static Links links;
  @JsonProperty("source_description")
  private static String sourceDescription;
  private static List<Upgrade> upgrades;
}
