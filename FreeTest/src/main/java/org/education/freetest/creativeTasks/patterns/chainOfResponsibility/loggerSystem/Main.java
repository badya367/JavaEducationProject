package org.education.freetest.creativeTasks.patterns.chainOfResponsibility.loggerSystem;

public class Main {
    public static void main(String[] args) {
        Logger infoLogger = new InfoLogger();
        Logger debugLogger = new DebugLogger();
        Logger errorLogger = new ErrorLogger();

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        infoLogger.log("Запущена программа", Level.INFO);
        infoLogger.log("Вызван метод processData()", Level.DEBUG);
        infoLogger.log("Произошла критическая ошибка", Level.ERROR);
    }
}
