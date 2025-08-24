public class WalletMethod implements IPayment {
    @Override
    public String pay(Payment payment) {
        return "Wallet debit: " + payment.getAmount();
    }
}
