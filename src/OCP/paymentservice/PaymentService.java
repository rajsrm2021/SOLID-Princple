package OCP.paymentservice;

import OCP.payment.Payment;

public class PaymentService {
    public void pay(Payment payment, double amount) {
        payment.PaymentMethod(amount);
    }
}
