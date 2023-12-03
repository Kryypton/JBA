package com.kryptonn.jba.model.data.wow.guildCrestAPI;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.IdMedia;
import com.kryptonn.jba.model.base.Links;

public record GuildCrestComponentsIndex(List<IdMedia> emblems, List<IdMedia> borders, EmblemsBordersBackgrounds colors) {
  @JsonProperty("_links")
  private static Links links;
}