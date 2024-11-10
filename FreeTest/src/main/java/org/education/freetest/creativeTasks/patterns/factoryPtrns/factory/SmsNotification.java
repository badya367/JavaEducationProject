package org.education.freetest.creativeTasks.patterns.factoryPtrns.factory;

public class SmsNotification implements Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println("Вы отправили письмо по смс: " + message);
    }
}
