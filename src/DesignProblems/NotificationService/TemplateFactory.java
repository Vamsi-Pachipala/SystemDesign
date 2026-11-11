package DesignProblems.NotificationService;

public class TemplateFactory {

    public static TemplateService getTemplate(NOTIFICATIONTYPE type) {
        switch (type) {
            case EMAIL:
                return new EmailTemplate();
            case SMS:
                return new SMSTemplate();
            case PUSH_NOTIFICATION:
               // return new PushNotificationTemplate();
            default:
                throw new IllegalArgumentException("Invalid notification type: " + type);
        }
    }
}
