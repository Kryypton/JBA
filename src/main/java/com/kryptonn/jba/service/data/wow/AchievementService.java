package com.kryptonn.jba.service.data.wow;

import com.kryptonn.jba.client.ApiResponse;
import com.kryptonn.jba.client.BlizzardApiClient;
import com.kryptonn.jba.model.data.wow.achievementAPI.AchievementCategoryID;
import com.kryptonn.jba.model.data.wow.achievementAPI.AchievementCategoryIndex;
import com.kryptonn.jba.model.data.wow.achievementAPI.AchievementID;
import com.kryptonn.jba.model.data.wow.achievementAPI.AchievementIndex;
import com.kryptonn.jba.model.data.wow.achievementAPI.AchievementMedia;

import org.springframework.stereotype.Service;

@Service
public class AchievementService  {
    private final BlizzardApiClient blizzardApiClient;

    public AchievementService(BlizzardApiClient blizzardApiClient) {
        this.blizzardApiClient = blizzardApiClient;
    }

    public ApiResponse<AchievementCategoryIndex> getAchievementCategoryIndex() {
        return blizzardApiClient.getAchievementCategoryIndex();
    }

    public ApiResponse<AchievementCategoryID> getAchievementCategoryID(Integer id) {
        return blizzardApiClient.getAchievementCategoryID(id);
    }

    public ApiResponse<AchievementIndex> getAchievementIndex() {
        return blizzardApiClient.getAchievementIndex();
    }

    public ApiResponse<AchievementID> getAchievementID(Integer id) {
        return blizzardApiClient.getAchievementID(id);
    }

    public ApiResponse<AchievementMedia> getAchievementMedia(Integer id) {
        return blizzardApiClient.getAchievementMedia(id);
    }
}
