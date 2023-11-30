package com.kryptonn.jba.service.data.wow;

import com.kryptonn.jba.client.ApiResponse;
import com.kryptonn.jba.client.BlizzardApiClient;
import com.kryptonn.jba.model.data.wow.conectedRealmAPI.ConnectedRealmID;

import org.springframework.stereotype.Service;

@Service
public class AuctionHouseService {
    private final BlizzardApiClient blizzardApiClient;

    public AuctionHouseService(BlizzardApiClient blizzardApiClient) {
        this.blizzardApiClient = blizzardApiClient;
    }

    public ApiResponse<ConnectedRealmID> getConnectedRealmID(Integer id) {
        return blizzardApiClient.getConnectedRealmID(id);
    }
    
}
