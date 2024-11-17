package org.education.freetest.creativeTasks.patterns.proxy.rateLimiting;

public class TooManyRequestsException extends RuntimeException{
    public TooManyRequestsException(String message) {
        super(message);
    }
}
