package DesignProblems.NotificationService;

public class NotificationSenderFactory {

    public static NotificationSender getNotificationSender(NOTIFICATIONTYPE type) {
        switch (type) {
            case EMAIL:
                return new EmailNotificationSender();
            case SMS:
                return new SMSNotificationSender();
            case PUSH_NOTIFICATION:
               // return new PushNotificationSender();
            default:
                throw new IllegalArgumentException("Invalid notification type: " + type);
        }
    }
}
