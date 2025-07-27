package OCP.payment;

public class CerditCardPayment implements Payment {

    public void PaymentMethod(double amount) {
        System.out.println("Credit card OCP.payment" + amount);
    }
}
