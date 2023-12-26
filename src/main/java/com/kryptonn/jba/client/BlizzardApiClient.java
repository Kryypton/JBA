package com.kryptonn.jba.client;

import com.kryptonn.jba.config.JBAServerLocales;
import com.kryptonn.jba.model.data.wow.guild.GuildAPI.Guild;
import com.kryptonn.jba.model.profile.user.wow.accountProfileAPI.accountProfileSummary.Character;
import com.kryptonn.jba.model.profile.wow.character.characterProfileAPI.CharacterProfileSummary;
import com.kryptonn.jba.security.oauth.JBA;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
public class BlizzardApiClient {
    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(BlizzardApiClient.class);

    private final RestTemplate restTemplate;
    private JBA jba;
    private final JBAServerLocales jbaServerLocales;

    public BlizzardApiClient(RestTemplate restTemplate, JBA jba, JBAServerLocales jbaServerLocales){
        this.restTemplate = restTemplate;
        this.jbaServerLocales = jbaServerLocales;
        this.jba = jba;
    }

    public ApiResponse<Guild> getGuild(String realmSlug, String nameSlug) {
        ApiResponse<Guild> response = new ApiResponse<Guild>();
        String url = "";

        url = String.format("%s/data/wow/guild/%s/%s?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                realmSlug.toLowerCase().replace(' ', '-'),
                nameSlug.toLowerCase().replace(' ', '-'),
                jbaServerLocales.getProfileNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken()); 

        logger.info("trying to get guild with url : \'" + url + "\'");

        try {
            response.setData(restTemplate.getForObject(url, Guild.class));
            response.setSuccess();
            logger.info("Fetching AchievementCategoryIndex");
            logger.info("response " + response.getData().getName());
        } catch (HttpClientErrorException e) {
            logger.error("A BlizzardWebApiError object was returned", e);
        } catch (RestClientException e) {
            logger.error("Failed to fetch AchievementCategoryIndex", e);
        }

        return response;
    }

    public <T> ApiResponse<T> getRessource(String urlSource, Class<T> responseType) {
        ApiResponse<T> response = new ApiResponse<>();
        String url = URLDecoder.decode(urlSource, StandardCharsets.UTF_8).concat("&locale=" + jbaServerLocales.getLocale() + "&access_token=" + jba.getAccessToken()) ;
        
        logger.info("trying to get resource with url : " + url);

        try {
            T data = restTemplate.getForObject(url, responseType);
            response.setData(data);
            response.setSuccess();
            if (data != null) logger.info("Fetching resource info : " + data.getClass().getName());
            logger.info("response " + response.getStatusCode());
        } catch (HttpClientErrorException e) {
            logger.error("A BlizzardWebApiError object was returned", e);
        } catch (RestClientException e) {
            logger.error("Failed to fetch resource", e);
        }

        return response;
    }

    public ApiResponse<CharacterProfileSummary> getProfileSummary(String realmSlug, String characterName) {
        ApiResponse<CharacterProfileSummary> response = new ApiResponse<CharacterProfileSummary>();
        String url = "";

        url = String.format("%s/profile/wow/character/%s/%s?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                realmSlug.toLowerCase().replace(' ', '-'),
                characterName.toLowerCase().replace(' ', '-'),
                jbaServerLocales.getProfileNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken()); 

        logger.info("trying to get character with url : \'" + url + "\'");

        try {
            response.setData(restTemplate.getForObject(url, CharacterProfileSummary.class));
            response.setSuccess();
            logger.info("Fetching AchievementCategoryIndex");
            logger.info("response " + response.getStatusCode());
        } catch (HttpClientErrorException e) {
            if (response.getStatusCode().code() == 403) {
                logger.info("Autorization refused");
                return response;
            } else {
                logger.error("A BlizzardWebApiError object was returned", e);
            }
        } catch (RestClientException e) {
            logger.error("Failed to fetch AchievementCategoryIndex", e);
        }

        return response;
    }

    public ApiResponse<Character> getAccountProfileSummary() {
        ApiResponse<Character> response = new ApiResponse<Character>();
        String url = "";

        url = String.format("%s/profile/user/wow?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                jbaServerLocales.getProfileNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken()); 

        logger.info("trying to get account profile summary with url : \'" + url + "\'");

        try {
            response.setData(restTemplate.getForObject(url, Character.class));
            response.setSuccess();
            logger.info("Fetching AchievementCategoryIndex");
            logger.info("response " + response.getStatusCode());
        } catch (HttpClientErrorException e) {
            logger.error("A BlizzardWebApiError object was returned", e);
        } catch (RestClientException e) {
            logger.error("Failed to fetch AchievementCategoryIndex", e);
        }

        return response;
    }

}