package com.kryptonn.jba.service.data.wow;

import com.kryptonn.jba.client.ApiResponse;
import com.kryptonn.jba.client.BlizzardApiClient;
import com.kryptonn.jba.model.data.wow.covenantAPI.CovenantIndex;
import com.kryptonn.jba.model.base.LinksAssetsID;
import com.kryptonn.jba.model.data.wow.covenantAPI.Covenant;
import com.kryptonn.jba.model.data.wow.covenantAPI.SoulbindConduitIndex;
import com.kryptonn.jba.model.data.wow.covenantAPI.SoulbindConduit;
import com.kryptonn.jba.model.data.wow.covenantAPI.SoulbindIndex;
import com.kryptonn.jba.model.data.wow.covenantAPI.Soulbind;

import org.springframework.stereotype.Service;

@Service
public class CovenantService {
    private final BlizzardApiClient blizzardApiClient;

    public CovenantService(BlizzardApiClient blizzardApiClient) {
        this.blizzardApiClient = blizzardApiClient;
    }

    public ApiResponse<CovenantIndex> getCovenantIndex() {
        return blizzardApiClient.getCovenantIndex();
    }

    public ApiResponse<Covenant> getCovenant(Integer id) {
        return blizzardApiClient.getCovenant(id);
    }

    public ApiResponse<LinksAssetsID> getCovenantMedia(Integer id) {
        return blizzardApiClient.getCovenantMedia(id);
    }

    public ApiResponse<SoulbindConduitIndex> getSoulbindConduitIndex() {
        return blizzardApiClient.getSoulbindConduitIndex();
    }

    public ApiResponse<SoulbindConduit> getSoulbindConduit(Integer id) {
        return blizzardApiClient.getSoulbindConduit(id);
    }

    public ApiResponse<SoulbindIndex> getSoulbindIndex() {
        return blizzardApiClient.getSoulbindIndex();
    }

    public ApiResponse<Soulbind> getSoulbind(Integer id) {
        return blizzardApiClient.getSoulbind(id);
    }
}
