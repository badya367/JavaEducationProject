package org.education.freetest.creativeTasks.patterns.proxy.cachingData;

public class Main {
    public static void main(String[] args) {
        Api api = new CachedApiService();
        System.out.println("Первый запрос:");
        System.out.println(api.fetchData("users"));

        System.out.println("Повторный запрос:");
        System.out.println(api.fetchData("users"));
    }
}
