public class UpiMethod implements IPayment {
    @Override
    public String pay(Payment payment) {
        return "Paid via UPI: " + payment.getAmount();
    }
}
