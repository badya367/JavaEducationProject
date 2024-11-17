package org.education.freetest.creativeTasks.patterns.proxy.callLogging;

public class Main {
    public static void main(String[] args) {
        IDatabase databaseWithLog = new LoggingDatabaseProxy(new Database());
        databaseWithLog.insert("user 1");
        databaseWithLog.update("user 2");
        databaseWithLog.delete("user 3");
    }
}
