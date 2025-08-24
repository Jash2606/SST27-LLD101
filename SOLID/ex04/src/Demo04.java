
public class Demo04 {
    public static void main(String[] args) {
        Payment payment = new Payment(PaymentState.UPI, 499);
        PaymentService paymentService = new PaymentService();
        System.out.println(paymentService.pay(payment));
    }
}
