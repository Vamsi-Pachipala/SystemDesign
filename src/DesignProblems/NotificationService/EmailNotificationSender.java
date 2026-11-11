package DesignProblems.NotificationService;

public class EmailNotificationSender implements NotificationSender {

    public void sendNotification(User user, String message) {
        // Logic to send email notification
        System.out.println("Sending Email to " + user.email + ": " + message);
    }
}
