package org.education.freetest.creativeTasks.patterns.chainOfResponsibility.technicalSupportProcessing;

public interface SupportHandler {
    void setSupportHandler(SupportHandler supportHandler);
    void handleRequest(String issue, Priority priority);

}
