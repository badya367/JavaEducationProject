package org.education.freetest.creativeTasks.patterns.proxy.rateLimiting;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        IRequestHandler requestHandler = new RateLimitingProxy();
        requestHandler.handlerRequest("INSERT");
        Thread.sleep(4000);
        requestHandler.handlerRequest("INSERT");
        Thread.sleep(4000);
        requestHandler.handlerRequest("INSERT");
        Thread.sleep(4000);
        requestHandler.handlerRequest("INSERT");
        Thread.sleep(4000);
        requestHandler.handlerRequest("INSERT");
    }
}
