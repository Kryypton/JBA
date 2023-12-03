package com.kryptonn.jba.model.profile.user.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kryptonn.jba.model.base.KeyNameIdSlug;
import com.kryptonn.jba.model.base.KeyNameID;
import com.kryptonn.jba.model.base.Link;
import com.kryptonn.jba.model.base.TypeName;

public record Character(Link character, String name, Integer id, KeyNameIdSlug realm, TypeName gender, TypeName faction, Integer level) {
  @JsonProperty("protected_character")
  private static Link protectedCharacter;
  @JsonProperty("playable_class")
  private static KeyNameID playableClass;
  @JsonProperty("playable_race")
  private static KeyNameID playableRace;
}
