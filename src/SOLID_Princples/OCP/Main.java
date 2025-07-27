package SOLID_Princples.OCP;

import SOLID_Princples.OCP.payment.CerditCardPayment;
import SOLID_Princples.OCP.payment.UpiPayment;
import SOLID_Princples.OCP.paymentservice.PaymentService;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.pay(new CerditCardPayment(),100000.1);
        paymentService.pay(new UpiPayment(),100000.1);
    }
}
