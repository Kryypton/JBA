package com.kryptonn.jba.service.data.wow;

import com.kryptonn.jba.client.ApiResponse;
import com.kryptonn.jba.client.BlizzardApiClient;
import com.kryptonn.jba.model.data.wow.creatureAPI.Creature;
import com.kryptonn.jba.model.data.wow.creatureAPI.CreatureFamily;
import com.kryptonn.jba.model.data.wow.creatureAPI.CreatureType;
import com.kryptonn.jba.model.data.wow.creatureAPI.CreatureFamilliesIndex;
import com.kryptonn.jba.model.data.wow.creatureAPI.CreatureTypesIndex;
import com.kryptonn.jba.model.base.LinksAssetsID;

import org.springframework.stereotype.Service;

@Service
public class CreatureService {
    private final BlizzardApiClient blizzardApiClient;

    public CreatureService(BlizzardApiClient blizzardApiClient) {
        this.blizzardApiClient = blizzardApiClient;
    }

    public ApiResponse<CreatureFamilliesIndex> getCreatureFamilliesIndex() {
        return blizzardApiClient.getCreatureFamilliesIndex();
    }

    public ApiResponse<CreatureFamily> getCreatureFamily(Integer id) {
        return blizzardApiClient.getCreatureFamily(id);
    }

    public ApiResponse<CreatureTypesIndex> getCreatureTypesIndex() {
        return blizzardApiClient.getCreatureTypesIndex();
    }

    public ApiResponse<CreatureType> getCreatureType(Integer id) {
        return blizzardApiClient.getCreatureType(id);
    }

    public ApiResponse<Creature> getCreature(Integer id) {
        return blizzardApiClient.getCreature(id);
    }

    public ApiResponse<LinksAssetsID> getCreatureDisplayMedia(Integer id) {
        return blizzardApiClient.getCreatureDisplayMedia(id);
    }

    public ApiResponse<LinksAssetsID> getCreatureFamilyMedia(Integer id) {
        return blizzardApiClient.getCreatureFamilyMedia(id);
    }

    
}
