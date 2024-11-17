package org.education.freetest.creativeTasks.patterns.proxy.rateLimiting;

import java.time.LocalTime;
import java.util.LinkedList;
import java.util.Queue;

public class RateLimitingProxy implements IRequestHandler{
    private Queue<Long> requestTimestamps = new LinkedList<>();
    private RequestHandler requestHandler;


    @Override
    public void handlerRequest(String request) {
        if(getRequestCount() > 2){
            throw new TooManyRequestsException("Слишком много запросов, попробуйте позже");
        }
        getRequestHandler().handlerRequest(request);
        registerRequest();
    }

    private RequestHandler getRequestHandler(){
        if(requestHandler == null){
            requestHandler = new RequestHandler();
        }
        return requestHandler;
    }

    private void registerRequest() {
        long currentTime = System.currentTimeMillis();
        requestTimestamps.add(currentTime);
        cleanOldRequests(currentTime);
    }

    private void cleanOldRequests(long currentTime) {
        while (!requestTimestamps.isEmpty() && requestTimestamps.peek() < currentTime - 10000) {
            requestTimestamps.poll();
        }
    }

    private int getRequestCount(){
        long currentTime = System.currentTimeMillis();
        cleanOldRequests(currentTime);
        return requestTimestamps.size();
    }
}
