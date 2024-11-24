package org.education.freetest.creativeTasks.patterns.chainOfResponsibility.loggerSystem;

public abstract class Logger {
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public abstract void log(String message, Level level);
}
