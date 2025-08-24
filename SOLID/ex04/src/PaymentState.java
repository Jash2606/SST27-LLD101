public enum PaymentState {
    CARD(new CardMethod()),
    UPI(new UpiMethod()),
    WALLET(new WalletMethod());

    private IPayment payment;

    PaymentState(IPayment payment){
        this.payment = payment;
    }

    public String pay(Payment p){
        return payment.pay(p);
    }

}
