package SOLID_Princples.OCP.payment;

public class CerditCardPayment implements Payment {

    public void PaymentMethod(double amount) {
        System.out.println("Credit card SOLID_Princples.OCP.payment" + amount);
    }
}
