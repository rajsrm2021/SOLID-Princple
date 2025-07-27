package SOLID_Princples.OCP.payment;

public class UpiPayment implements Payment {
    public void PaymentMethod(double amount){
        System.out.println("Payment method upi" + amount );
    }
}
