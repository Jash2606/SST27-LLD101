package com.example.payments;

public class SafeCashAdapter implements PaymentGateway {
    private SafeCashClient safeCashClient;

    public SafeCashAdapter(SafeCashClient safeCashClient) {
        this.safeCashClient = safeCashClient;
    }

    @Override
    public String charge(String customerId, int amountCents) {
        SafeCashPayment payment = safeCashClient.createPayment(amountCents / 100, customerId);
        return payment.confirm();
    }
}
