package org.education.freetest.creativeTasks.patterns.factoryPtrns.factory;

public class Main {
    public static void main(String[] args) {
        Notification smsNotification = NotificationFactory.getNotification(NotificationType.SMS);
        Notification emailNotification = NotificationFactory.getNotification(NotificationType.EMAIL);
        Notification pushNotification = NotificationFactory.getNotification(NotificationType.PUSH);


        String message = "Здравствуйте, это компания орифлейм";

        smsNotification.sendNotification(message);
        emailNotification.sendNotification(message);
        pushNotification.sendNotification(message);
    }
}
