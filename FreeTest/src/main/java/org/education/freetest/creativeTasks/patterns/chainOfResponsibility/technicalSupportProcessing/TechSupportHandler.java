package org.education.freetest.creativeTasks.patterns.chainOfResponsibility.technicalSupportProcessing;

public class TechSupportHandler implements SupportHandler{
    private SupportHandler supportHandler;
    @Override
    public void setSupportHandler(SupportHandler supportHandler) {
        this.supportHandler = supportHandler;
    }

    @Override
    public void handleRequest(String issue, Priority priority) {
        if(priority == Priority.HIGH){
            System.out.println("Технический специалист решает запрос: " + issue);
        } else if (supportHandler != null) {
            supportHandler.handleRequest(issue,priority);
        } else {
            System.out.println("Невозможно решить запрос");
        }
    }
}
