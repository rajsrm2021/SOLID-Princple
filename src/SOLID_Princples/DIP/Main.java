package SOLID_Princples.DIP;

import SOLID_Princples.DIP.messages.EmailService;
import SOLID_Princples.DIP.messages.MessageService;
import SOLID_Princples.DIP.notificationService.Notification;

public class Main {
    public static void main(String[] args) {
        MessageService service = new EmailService(); // Or new SMSService()
        Notification notification = new Notification(service);
        notification.notifyUser("\nHello, Raj!");
    }
}
