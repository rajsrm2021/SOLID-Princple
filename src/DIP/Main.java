package DIP;

import DIP.messages.EmailService;
import DIP.messages.MessageService;
import DIP.notificationService.Notification;

public class Main {
    public static void main(String[] args) {
        MessageService service = new EmailService(); // Or new SMSService()
        Notification notification = new Notification(service);
        notification.notifyUser("\nHello, Raj!");
    }
}
