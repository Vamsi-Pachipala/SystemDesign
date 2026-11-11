package DesignProblems.NotificationService;

import java.util.ArrayList;
import java.util.List;
public class User {

    int id;
    String name;
    String email;
    String phoneNumber;

    List<NOTIFICATIONTYPE> notificationPreferences;

    User(int id, String name, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        notificationPreferences = new ArrayList<>();
    }

    void addNotificationPreference(NOTIFICATIONTYPE notificationType) {
        this.notificationPreferences.add(notificationType);
    }

    void removeNotificationPreference(NOTIFICATIONTYPE notificationType) {
        this.notificationPreferences.remove(notificationType);
    }
}
