package SOLID_Princples.OCP.notificationServices;

import SOLID_Princples.OCP.notification.INotification;

public class NotificationService {

    public void NotifyUser(INotification notification, String message) {
        notification.SendMessage(message);
    }
}
