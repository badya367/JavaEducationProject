package org.education.freetest.creativeTasks.patterns.chainOfResponsibility.loggerSystem;

public class DebugLogger extends Logger{
    @Override
    public void log(String message, Level level) {
        if(level == Level.DEBUG) {
            System.out.println("Логгер DEBUG обрабатывает сообщение \"" + message + "\"");
        } else if (nextLogger != null) {
            nextLogger.log(message, level);
        } else {
            System.out.println("Невозможно обработать сообщение");
        }
    }
}
