package com.kryptonn.jba.service.data.wow;

import com.kryptonn.jba.client.ApiResponse;
import com.kryptonn.jba.client.BlizzardApiClient;
import com.kryptonn.jba.model.base.LinksAssetsID;
import com.kryptonn.jba.model.data.wow.azeriteEssenceAPI.AzeriteEssence;
import com.kryptonn.jba.model.data.wow.azeriteEssenceAPI.AzeriteEssenceIndex;

import org.springframework.stereotype.Service;

@Service
public class AzeritEssenceService {
    private final BlizzardApiClient blizzardApiClient;

    public AzeritEssenceService(BlizzardApiClient blizzardApiClient) {
        this.blizzardApiClient = blizzardApiClient;
    }

    public ApiResponse<AzeriteEssenceIndex> getAzeriteEssenceIndex() {
        return blizzardApiClient.getAzeriteEssenceIndex();
    }

    public ApiResponse<AzeriteEssence> getAzeriteEssence(Integer id) {
        return blizzardApiClient.getAzeriteEssence(id);
    }

    public ApiResponse<LinksAssetsID> getAzeriteEssenceMedia(Integer id) {
        return blizzardApiClient.getAzeriteEssenceMedia(id);
    }

}
