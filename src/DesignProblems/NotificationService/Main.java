package DesignProblems.NotificationService;

public class Main {

    public static void main(String[] args) {

        User user1 = new User( 1, "Alice", "alice@gamil.com", "1234567890");

        // subscribe to email notifications
        user1.addNotificationPreference(NOTIFICATIONTYPE.EMAIL);
        user1.addNotificationPreference(NOTIFICATIONTYPE.SMS);


        NotificationService notificationService = new NotificationService();

        notificationService.sendNotification(user1, "Hello Alice! This is a test notification.");

    }
}
