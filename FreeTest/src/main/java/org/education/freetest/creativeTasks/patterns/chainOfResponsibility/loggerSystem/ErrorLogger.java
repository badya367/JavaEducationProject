package org.education.freetest.creativeTasks.patterns.chainOfResponsibility.loggerSystem;

public class ErrorLogger extends Logger{
    @Override
    public void log(String message, Level level) {
        if(level == Level.ERROR) {
            System.out.println("Логгер ERROR обрабатывает сообщение \"" + message + "\"");
        } else if (nextLogger != null) {
            nextLogger.log(message, level);
        } else {
            System.out.println("Невозможно обработать сообщение");
        }
    }
}
