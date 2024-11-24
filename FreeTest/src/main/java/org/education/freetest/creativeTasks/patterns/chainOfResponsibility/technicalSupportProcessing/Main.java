package org.education.freetest.creativeTasks.patterns.chainOfResponsibility.technicalSupportProcessing;

public class Main {
    public static void main(String[] args) {
        SupportHandler junior = new JuniorSupportHandler();
        SupportHandler senior = new SeniorSupportHandler();
        SupportHandler tech = new TechSupportHandler();

        junior.setSupportHandler(senior);
        senior.setSupportHandler(tech);

        junior.handleRequest("Не работает кнопка", Priority.LOW);
        junior.handleRequest("Компьютер не включается", Priority.MEDIUM);
        junior.handleRequest("Сервер недоступен", Priority.HIGH);
    }
}
