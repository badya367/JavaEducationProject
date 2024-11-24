package org.education.freetest.creativeTasks.patterns.chainOfResponsibility.technicalSupportProcessing;

public class SeniorSupportHandler implements SupportHandler{
    private SupportHandler supportHandler;
    @Override
    public void setSupportHandler(SupportHandler supportHandler) {
        this.supportHandler = supportHandler;
    }

    @Override
    public void handleRequest(String issue, Priority priority) {
        if(priority == Priority.MEDIUM){
            System.out.println("Старший оператор решает запрос: " + issue);
        } else if (supportHandler != null) {
            supportHandler.handleRequest(issue,priority);
        } else {
            System.out.println("Невозможно решить запрос");
        }
    }
}
