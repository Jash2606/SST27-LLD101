public class CardMethod implements IPayment {
    @Override
    public String pay(Payment payment) {
        return "Charged card: " + payment.getAmount();
    }
}
