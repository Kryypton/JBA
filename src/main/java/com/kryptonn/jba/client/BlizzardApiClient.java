package com.kryptonn.jba.client;

import com.kryptonn.jba.config.JBAServerLocales;
import com.kryptonn.jba.model.data.wow.AchievementCategoryIndex;
import com.kryptonn.jba.security.oauth.JBA;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BlizzardApiClient {
    private final RestTemplate restTemplate;
    private JBA jba;
    private final JBAServerLocales jbaServerLocales;

    public BlizzardApiClient(RestTemplate restTemplate, JBA jba, JBAServerLocales jbaServerLocales){
        this.restTemplate = restTemplate;
        this.jbaServerLocales = jbaServerLocales;
        this.jba = jba;
    }

    public AchievementCategoryIndex getAchievementCategoryIndex() {
        System.out.println(jbaServerLocales.getHost() + "/data/wow/achievement-category/index" + "?namespace=" + jbaServerLocales.getStaticNamespace() + "&locale=" + jbaServerLocales.getLocale() + "&access_token=" + jba.getAccessToken());
        return restTemplate.getForObject(jbaServerLocales.getHost() + "/data/wow/achievement-category/index" + "?namespace=" + jbaServerLocales.getStaticNamespace() + "&locale=" + jbaServerLocales.getLocale() + "&access_token=" + jba.getAccessToken(), AchievementCategoryIndex.class);
    }
}