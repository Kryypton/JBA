package com.kryptonn.jba.service.data.wow;

import org.springframework.stereotype.Service;

import com.kryptonn.jba.client.ApiResponse;
import com.kryptonn.jba.client.BlizzardApiClient;
import com.kryptonn.jba.model.data.wow.guild.GuildAPI.Guild;
import com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountProfileSummary.Character;
import com.kryptonn.jba.model.profile.wow.character.characterProfileAPI.CharacterProfileSummary;

@Service
public class JBAService {
  private final BlizzardApiClient blizzardApiClient;

  public JBAService(BlizzardApiClient blizzardApiClient) {
    this.blizzardApiClient = blizzardApiClient;
  }

  public <T> ApiResponse<T> getRessource(String urlSource, Class<T> clazz) {
    return blizzardApiClient.getRessource(urlSource, clazz);
  }

  public ApiResponse<Guild> getGuild(String realmSlug, String guildSlug) {
    return blizzardApiClient.getGuild(realmSlug, guildSlug);
  }

  public ApiResponse<Character> getAccountProfileSummary() {
    return blizzardApiClient.getAccountProfileSummary();
  }

  public ApiResponse<CharacterProfileSummary> getProfileSummary(String realmSlug, String characterName) {
    return blizzardApiClient.getProfileSummary(realmSlug, characterName);
  }
}
