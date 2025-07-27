package OCP;

import OCP.payment.CerditCardPayment;
import OCP.payment.UpiPayment;
import OCP.paymentservice.PaymentService;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.pay(new CerditCardPayment(),100000.1);
        paymentService.pay(new UpiPayment(),100000.1);
    }
}
