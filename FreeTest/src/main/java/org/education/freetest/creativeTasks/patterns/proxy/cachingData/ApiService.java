package org.education.freetest.creativeTasks.patterns.proxy.cachingData;

import java.util.concurrent.TimeUnit;

public class ApiService implements Api{
    @Override
    public String fetchData(String requestType) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return requestType+":some answer";
    }
}
