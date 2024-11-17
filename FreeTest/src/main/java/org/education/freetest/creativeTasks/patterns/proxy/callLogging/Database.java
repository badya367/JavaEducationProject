package org.education.freetest.creativeTasks.patterns.proxy.callLogging;

public class Database implements IDatabase{
    @Override
    public void insert(String data) {
        System.out.println("Записал в базу данных: " + data);
    }

    @Override
    public void update(String data) {
        System.out.println("Обновил в базе данных: " + data);
    }

    @Override
    public void delete(String data) {
        System.out.println("Удалил из базы данных: " + data);
    }
}
