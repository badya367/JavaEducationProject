package org.education.freetest.creativeTasks.patterns.proxy.cachingData;

import java.util.HashMap;
import java.util.Map;

public class CachedApiService implements Api{
    private ApiService apiService;
    private Map<String, String> cache;

    public CachedApiService() {
        this.apiService = new ApiService();
        this.cache = new HashMap<>();
    }

    @Override
    public String fetchData(String requestType) {
        if(cache.containsKey(requestType)){
            System.out.println("Возвращаю кэшированные данные для запроса: " + requestType);
            return cache.get(requestType);
        }
        System.out.println("Возвращаю реальный запрос для: " + requestType);
        String data = apiService.fetchData(requestType);
        cache.put(requestType,data);
        return data;
    }
}
