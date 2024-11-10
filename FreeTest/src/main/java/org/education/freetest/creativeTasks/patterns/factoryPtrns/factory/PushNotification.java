package org.education.freetest.creativeTasks.patterns.factoryPtrns.factory;

public class PushNotification implements Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println("Вы отправили уведомление: " + message);
    }
}
