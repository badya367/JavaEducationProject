package org.education.freetest.creativeTasks.patterns.factoryPtrns.factory;

public class EmailNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Вы отправили письмо по почте: " + message);
    }
}
