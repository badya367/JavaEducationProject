package org.education.freetest.creativeTasks.patterns.proxy.callLogging;

public class LoggingDatabaseProxy implements IDatabase {
    private Database database;

    public LoggingDatabaseProxy(Database database) {
        this.database = database;
    }

    @Override
    public void insert(String data) {
        database.insert(data);
        System.out.println("INSERT: Добавлено значение '" + data + "'");
    }

    @Override
    public void update(String data) {
        database.update(data);
        System.out.println("UPDATE: Обновлено значение '" + data + "'");

    }

    @Override
    public void delete(String data) {
        database.delete(data);
        System.out.println("DELETE: Удалено значение '" + data + "'");
    }
}
