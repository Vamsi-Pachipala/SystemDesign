package DesignProblems.NotificationService;

public class NotificationService {

    NotificationSender notificationSender;

    NotificationSenderFactory notificationSenderFactory;


    NotificationService() {

    }

    public void sendNotification(User user, String message) {

        for (NOTIFICATIONTYPE type : user.notificationPreferences) {

            TemplateService template =
                    TemplateFactory.getTemplate(type);

            NotificationSender sender =
                    NotificationSenderFactory.getNotificationSender(type);

            String formattedMessage =
                    template.getTemplate(message);

            sender.sendNotification(user, formattedMessage);
        }
    }


}
