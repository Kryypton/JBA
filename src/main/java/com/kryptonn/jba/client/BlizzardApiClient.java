package com.kryptonn.jba.client;

import com.kryptonn.jba.config.JBAServerLocales;
import com.kryptonn.jba.model.BlizzardWebApiError;
import com.kryptonn.jba.model.base.KeyNameIdSlug;
import com.kryptonn.jba.model.base.LinksAssetsID;
import com.kryptonn.jba.model.data.wow.achievementAPI.AchievementCategoryID;
import com.kryptonn.jba.model.data.wow.achievementAPI.AchievementCategoryIndex;
import com.kryptonn.jba.model.data.wow.achievementAPI.AchievementID;
import com.kryptonn.jba.model.data.wow.achievementAPI.AchievementIndex;
import com.kryptonn.jba.model.data.wow.achievementAPI.AchievementMedia;
import com.kryptonn.jba.model.data.wow.azeriteEssenceAPI.AzeriteEssence;
import com.kryptonn.jba.model.data.wow.azeriteEssenceAPI.AzeriteEssenceIndex;
import com.kryptonn.jba.model.data.wow.conectedRealmAPI.ConnectedRealmID;
import com.kryptonn.jba.model.data.wow.covenantAPI.Covenant;
import com.kryptonn.jba.model.data.wow.covenantAPI.CovenantIndex;
import com.kryptonn.jba.model.data.wow.covenantAPI.Soulbind;
import com.kryptonn.jba.model.data.wow.covenantAPI.SoulbindConduit;
import com.kryptonn.jba.model.data.wow.covenantAPI.SoulbindConduitIndex;
import com.kryptonn.jba.model.data.wow.covenantAPI.SoulbindIndex;
import com.kryptonn.jba.model.data.wow.creatureAPI.Creature;
import com.kryptonn.jba.model.data.wow.creatureAPI.CreatureFamilliesIndex;
import com.kryptonn.jba.model.data.wow.creatureAPI.CreatureFamily;
import com.kryptonn.jba.model.data.wow.creatureAPI.CreatureType;
import com.kryptonn.jba.model.data.wow.creatureAPI.CreatureTypesIndex;
import com.kryptonn.jba.model.data.wow.realmAPI.RealmIndex;
import com.kryptonn.jba.security.oauth.JBA;

import  org.slf4j.Logger;
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

    /// Achievement API

    public ApiResponse<AchievementCategoryIndex> getAchievementCategoryIndex() {
        ApiResponse<AchievementCategoryIndex> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/achievement-category/index?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());
               
        logger.info("url " + url);

        try {
            logger.info("Fetching AchievementCategoryIndex");
            response.setData(restTemplate.getForObject(url, AchievementCategoryIndex.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(), BlizzardWebApiError.class));
        } catch (RestClientException e) {
            logger.error("Failed to fetch AchievementCategoryIndex", e);
            return null;
        }
        return response;
    }

    public ApiResponse<AchievementCategoryID> getAchievementCategoryID(Integer id) {
        ApiResponse<AchievementCategoryID> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/achievement-category/%d?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                id,
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());

        logger.info("url " + url);

        try {
            
            response.setData(restTemplate.getForObject(url, AchievementCategoryID.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(), BlizzardWebApiError.class));
        } catch (RestClientException e) {
            logger.error("Failed to fetch AchievementCategoryID", e);
            return null;
        }
        return response;
    }

    public ApiResponse<AchievementIndex> getAchievementIndex() {
        ApiResponse<AchievementIndex> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/achievement/index?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());

        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, AchievementIndex.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(), BlizzardWebApiError.class));
        } catch (RestClientException e) {
            logger.error("Failed to fetch AchievementIndex", e);
            return null;
        }
        return response;
    }

    public ApiResponse<AchievementID> getAchievementID(Integer id) {
        ApiResponse<AchievementID> response = new ApiResponse<>();
        String url = String.format("%s/data/wow/achievement/%d?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                id,
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());
               
        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, AchievementID.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(), BlizzardWebApiError.class));
        } catch (RestClientException e) {
            logger.error("Failed to fetch AchievementID", e);
            return null;
        }
        return response;
    }

    public ApiResponse<AchievementMedia> getAchievementMedia(Integer id) {
        ApiResponse<AchievementMedia> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/media/achievement/%d?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                id,
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());
               
        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, AchievementMedia.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(), BlizzardWebApiError.class));
        } catch (RestClientException e) {
            logger.error("Failed to fetch AchievementMedia", e);
            return null;
        }
        return response;
    }

    /// Auction House API TODO: Add Auction House API

    /// Azerite Essence API

    public ApiResponse<AzeriteEssenceIndex> getAzeriteEssenceIndex() {
        ApiResponse<AzeriteEssenceIndex> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/azerite-essence/index?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());
                       
        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, AzeriteEssenceIndex.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(), BlizzardWebApiError.class));
        } catch (RestClientException e) {
            logger.error("Failed to fetch AzeriteEssenceIndex", e);
            return null;
        }
        return response;
    }

    public ApiResponse<AzeriteEssence> getAzeriteEssence(Integer id) {
        ApiResponse<AzeriteEssence> response = new ApiResponse<>();
        String url = String.format("%s/data/wow/azerite-essence/%d?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                id,
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());
                       
        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, AzeriteEssence.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(), BlizzardWebApiError.class));
        } catch (RestClientException e) {
            logger.error("Failed to fetch AzeriteEssence", e);
            return null;
        }
        return response;
    }

    public ApiResponse<LinksAssetsID> getAzeriteEssenceMedia(Integer id) {
        ApiResponse<LinksAssetsID> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/media/azerite-essence/%d?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                id,
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());
                       
        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, LinksAssetsID.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(), BlizzardWebApiError.class));
        } catch (RestClientException e) {
            logger.error("Failed to fetch AzeriteEssenceMedia", e);
            return null;
        }
        return response;
    }

    /// Connected Realm API 

    public ApiResponse<ConnectedRealmID> getConnectedRealmID(Integer id) {
        ApiResponse<ConnectedRealmID> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/connected-realm/%d?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                id,
                jbaServerLocales.getDynamicNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());
               
        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, ConnectedRealmID.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(), BlizzardWebApiError.class));
        } catch (RestClientException e) {
            logger.error("Failed to fetch ConnectedRealmID", e);
            return null;
        }
        return response;
    }

    public ApiResponse<RealmIndex> getConnectedRealmIndex() {
        ApiResponse<RealmIndex> response = new ApiResponse<>();
        
        String url = String.format("%s/data/wow/connected-realm/index?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                jbaServerLocales.getDynamicNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());
                       
        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, RealmIndex.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(), BlizzardWebApiError.class));
        } catch (RestClientException e) {
            logger.error("Failed to fetch ConnectedRealmIndex", e);
            return null;
        }
        return response;
    }

    /// Covenant API 
    public ApiResponse<CovenantIndex> getCovenantIndex() {
        ApiResponse<CovenantIndex> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/covenant/index?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());
                       
        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, CovenantIndex.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(), BlizzardWebApiError.class));
        } catch (RestClientException e) {
            logger.error("Failed to fetch CovenantIndex", e);
            return null;
        }
        return response;
    }

    public ApiResponse<Covenant> getCovenant(Integer id) {
        ApiResponse<Covenant> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/covenant/%d?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                id,
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());
                       
        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, Covenant.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(), BlizzardWebApiError.class));
        } catch (RestClientException e) {
            logger.error("Failed to fetch Covenant", e);
            return null;
        }
        return response;
    }

    public ApiResponse<LinksAssetsID> getCovenantMedia(Integer id) {
        ApiResponse<LinksAssetsID> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/media/covenant/%d?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                id,
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());
                       
        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, LinksAssetsID.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(), BlizzardWebApiError.class)); 
        } catch (RestClientException e) {
            logger.error("Failed to fetch CovenantMedia", e);
            return null;
        }
        return response;
    }

    public ApiResponse<SoulbindIndex> getSoulbindIndex() {
        ApiResponse<SoulbindIndex> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/covenant/soulbind/index?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());    

        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, SoulbindIndex.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(), BlizzardWebApiError.class)); 
        } catch (RestClientException e) {
            logger.error("Failed to fetch SoulbindIndex", e);
            return null;
        }
        return response;
    }

    public ApiResponse<Soulbind> getSoulbind(Integer id) {
        ApiResponse<Soulbind> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/covenant/soulbind/%d?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                id,
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());    

        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, Soulbind.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(), BlizzardWebApiError.class)); 
        } catch (RestClientException e) {
            logger.error("Failed to fetch Soulbind", e);
            return null;
        }
        return response;
    }

    public ApiResponse<SoulbindConduitIndex> getSoulbindConduitIndex() {
        ApiResponse<SoulbindConduitIndex> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/covenant/conduit/index?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());    

        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, SoulbindConduitIndex.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(), BlizzardWebApiError.class)); 
        } catch (RestClientException e) {
            logger.error("Failed to fetch SoulbindConduitIndex", e);
            return null;
        }
        return response;
    }

    public ApiResponse<SoulbindConduit> getSoulbindConduit(Integer id) {
        ApiResponse<SoulbindConduit> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/covenant/soulbind/%d?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                id,
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());    

        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, SoulbindConduit.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(), BlizzardWebApiError.class)); 
        } catch (RestClientException e) {
            logger.error("Failed to fetch SoulbindConduit", e);
            return null;
        }
        return response;
    }

    /// Realm API

    public ApiResponse<KeyNameIdSlug> getRealmID(Integer id) {
        ApiResponse<KeyNameIdSlug> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/realm/%d?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                id,
                jbaServerLocales.getDynamicNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());
               
        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, KeyNameIdSlug.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(), BlizzardWebApiError.class)); 
        } catch (RestClientException e) {
            logger.error("Failed to fetch RealmID", e);
            return null;
        }
        return response;
    }

    public ApiResponse<KeyNameIdSlug> getRealm(String name) {
        ApiResponse<KeyNameIdSlug> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/realm/%s?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                name,
                jbaServerLocales.getDynamicNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());
               
        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, KeyNameIdSlug.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(), BlizzardWebApiError.class)); 
        } catch (RestClientException e) {
            logger.error("Failed to fetch Realm", e);
            return null;
        }
        return response;
    }

    public ApiResponse<RealmIndex> getRealmIndex() {
        ApiResponse<RealmIndex> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/realm/index?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                jbaServerLocales.getDynamicNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());
               
        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, RealmIndex.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(),BlizzardWebApiError.class)); 
        } catch (RestClientException e) {
            logger.error("Failed to fetch RealmIndex", e);
            return null;
        }
        return response;
    }

    public ApiResponse<Creature> getCreature(Integer id) {
        ApiResponse<Creature> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/creature/%d?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                id,
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());
               
        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, Creature.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(),BlizzardWebApiError.class)); 
        } catch (RestClientException e) {
            logger.error("Failed to fetch Creature", e);
            return null;
        }
        return response;
    }

    public ApiResponse<CreatureType> getCreatureType(Integer id) {
        ApiResponse<CreatureType> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/creature-type/%d?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                id,
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());
               
        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, CreatureType.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(),BlizzardWebApiError.class)); 
        } catch (RestClientException e) {
            logger.error("Failed to fetch CreatureType", e);
            return null;
        }
        return response;
    }

    public ApiResponse<CreatureTypesIndex> getCreatureTypesIndex() {
        ApiResponse<CreatureTypesIndex> response = new ApiResponse<>();
        String url = String.format("%s/data/wow/creature-type/index?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());
               
        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, CreatureTypesIndex.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(),BlizzardWebApiError.class)); 
        } catch (RestClientException e) {
            logger.error("Failed to fetch CreatureTypesIndex", e);
            return null;
        }
        return response;
    }

    public ApiResponse<LinksAssetsID> getCreatureDisplayMedia(Integer id) {
        ApiResponse<LinksAssetsID> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/media/creature-display/%d?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                id,
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());
               
        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, LinksAssetsID.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(),BlizzardWebApiError.class)); 
        } catch (RestClientException e) {
            logger.error("Failed to fetch CreatureDisplayMedia", e);
            return null;
        }

        return response;
    }

    public ApiResponse<CreatureFamily> getCreatureFamily(Integer id) {
        ApiResponse<CreatureFamily> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/creature-family/%d?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                id,
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());
               
        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, CreatureFamily.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(),BlizzardWebApiError.class));
        } catch (RestClientException e) {
            logger.error("Failed to fetch CreatureFamily", e);
            return null;
        }

        return response;
    }

    public ApiResponse<CreatureFamilliesIndex> getCreatureFamilliesIndex() {
        ApiResponse<CreatureFamilliesIndex> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/creature-family/index?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());

        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, CreatureFamilliesIndex.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(),BlizzardWebApiError.class));
        } catch (RestClientException e) {
            logger.error("Failed to fetch CreatureFamilliesIndex", e);
            return null;
        }

        return response;
    }

    public ApiResponse<LinksAssetsID> getCreatureFamilyMedia(Integer id) {
        ApiResponse<LinksAssetsID> response = new ApiResponse<>();

        String url = String.format("%s/data/wow/media/creature-family/%d?namespace=%s&locale=%s&access_token=%s",
                jbaServerLocales.getHost(),
                id,
                jbaServerLocales.getStaticNamespace(),
                jbaServerLocales.getLocale(),
                jba.getAccessToken());

        logger.info("url " + url);

        try {
            response.setData(restTemplate.getForObject(url, LinksAssetsID.class));
            response.setSuccess();
        } catch (HttpClientErrorException e) {
            logger.error("An BizzardWebApiError object was returned");
            response.setError(restTemplate.getForObject(e.getResponseBodyAsString(),BlizzardWebApiError.class));
        } catch (RestClientException e) {
            logger.error("Failed to fetch CreatureFamilyMedia", e);
            return null;
        }

        return response;
    }
}