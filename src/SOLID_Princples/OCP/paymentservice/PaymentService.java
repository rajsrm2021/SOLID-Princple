package SOLID_Princples.OCP.paymentservice;

import SOLID_Princples.OCP.payment.Payment;

public class PaymentService {
    public void pay(Payment payment, double amount) {
        payment.PaymentMethod(amount);
    }
}
