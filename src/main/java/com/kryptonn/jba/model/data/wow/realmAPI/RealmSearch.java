package com.kryptonn.jba.model.data.wow.realmAPI;

import java.util.List;

import com.kryptonn.jba.model.base.KeyData;

public record RealmSearch(Integer page, Integer pageSize, Integer maxPageSize, Integer pageCount, Integer totalCount, List<KeyData> results) {
}
