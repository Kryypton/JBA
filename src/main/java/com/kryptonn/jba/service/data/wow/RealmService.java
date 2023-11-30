package com.kryptonn.jba.service.data.wow;

import com.kryptonn.jba.client.ApiResponse;
import com.kryptonn.jba.client.BlizzardApiClient;
import com.kryptonn.jba.model.base.KeyNameIdSlug;
import com.kryptonn.jba.model.data.wow.realmAPI.RealmIndex;

import org.springframework.stereotype.Service;

@Service
public class RealmService {
    private final BlizzardApiClient blizzardApiClient;

    public RealmService(BlizzardApiClient blizzardApiClient) {
        this.blizzardApiClient = blizzardApiClient;
    }

    public ApiResponse<RealmIndex> getRealmIndex() {
        return blizzardApiClient.getRealmIndex();
    }

    public ApiResponse<KeyNameIdSlug> getRealmID(Integer id) {
        return blizzardApiClient.getRealmID(id);
    }
}
