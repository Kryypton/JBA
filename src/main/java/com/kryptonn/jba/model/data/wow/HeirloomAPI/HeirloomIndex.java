package com.kryptonn.jba.model.data.wow.HeirloomAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.KeyNameID;
import com.kryptonn.jba.model.base.Links;

import java.util.List;

public record HeirloomIndex(List<KeyNameID> heirlooms) {
  @JsonProperty("_links")
  private static Links links;
}
