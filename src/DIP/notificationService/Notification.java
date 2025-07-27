package DIP.notificationService;

import DIP.messages.MessageService;

public class Notification {
    private MessageService messageService;

    // Injecting abstraction
    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        messageService.sendMessage(message);
    }
}