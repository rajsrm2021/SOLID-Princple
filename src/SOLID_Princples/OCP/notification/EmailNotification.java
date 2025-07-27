package SOLID_Princples.OCP.notification;

public class EmailNotification implements INotification {

    public void SendMessage(String message){
        System.out.println(message);
    }
}
