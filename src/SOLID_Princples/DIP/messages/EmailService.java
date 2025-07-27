package SOLID_Princples.DIP.messages;

public class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}
