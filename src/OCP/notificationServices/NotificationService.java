package OCP.notificationServices;

import OCP.notification.INotification;

public class NotificationService {

    public void NotifyUser(INotification notification, String message) {
        notification.SendMessage(message);
    }
}
