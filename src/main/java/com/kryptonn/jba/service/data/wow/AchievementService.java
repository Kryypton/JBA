package com.kryptonn.jba.service.data.wow;

import com.kryptonn.jba.client.BlizzardApiClient;
import com.kryptonn.jba.model.data.wow.AchievementCategoryIndex;
import org.springframework.stereotype.Service;

@Service
public class AchievementService {
    private final BlizzardApiClient blizzardApiClient;

    public AchievementService(BlizzardApiClient blizzardApiClient) {
        this.blizzardApiClient = blizzardApiClient;
    }

    public AchievementCategoryIndex getAchievementCategoryIndex() {
        return blizzardApiClient.getAchievementCategoryIndex();
    }
}
