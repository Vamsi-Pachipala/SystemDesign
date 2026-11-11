package DesignProblems.NotificationService;

public class SMSNotificationSender implements NotificationSender {

    public void sendNotification(User user, String message) {

        System.out.println("Sending SMS to " + user.name + ": " + message);
    }
}
