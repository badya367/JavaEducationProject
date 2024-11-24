package org.education.freetest.creativeTasks.patterns.chainOfResponsibility.loggerSystem;

public class InfoLogger extends Logger{
    @Override
    public void log(String message, Level level) {
        if(level == Level.INFO) {
            System.out.println("Логгер INFO обрабатывает сообщение \"" + message + "\"");
        } else if (nextLogger != null) {
            nextLogger.log(message, level);
        } else {
            System.out.println("Невозможно обработать сообщение");
        }
    }
}
