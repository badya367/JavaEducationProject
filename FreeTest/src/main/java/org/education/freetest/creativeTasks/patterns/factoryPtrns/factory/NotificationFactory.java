package org.education.freetest.creativeTasks.patterns.factoryPtrns.factory;

public class NotificationFactory {
    public static Notification getNotification(NotificationType type){
        Notification notification = null;
        switch (type) {
            case SMS:
                notification = new SmsNotification();
                break;
            case PUSH:
                notification = new PushNotification();
                break;
            case EMAIL:
                notification = new EmailNotification();
                break;
            default:
                throw new IllegalArgumentException("Wrong notification type:" + type);
        }

        return notification;
    }
}
