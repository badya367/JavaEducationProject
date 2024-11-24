package org.education.freetest.creativeTasks.patterns.chainOfResponsibility.technicalSupportProcessing;

public class JuniorSupportHandler implements SupportHandler{
    private SupportHandler supportHandler;
    @Override
    public void setSupportHandler(SupportHandler supportHandler) {
        this.supportHandler = supportHandler;
    }

    @Override
    public void handleRequest(String issue, Priority priority) {
        if(priority == Priority.LOW){
            System.out.println("Оператор начального уровня решает запрос: " + issue);
        } else if (supportHandler != null) {
            supportHandler.handleRequest(issue,priority);
        } else {
            System.out.println("Невозможно решить запрос");
        }
    }
}
