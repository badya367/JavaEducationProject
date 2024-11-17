package org.education.freetest.creativeTasks.patterns.proxy.rateLimiting;

public class RequestHandler implements IRequestHandler{
    @Override
    public void handlerRequest(String request) {
        System.out.println("Обрабатываю запрос: " + request);
    }
}
