public class Payment {
    PaymentState provider; 
    double amount;
    Payment(PaymentState p, double a){ provider=p; amount=a; }

    public PaymentState getProvider(){
        return provider;
    }

    public double getAmount(){
        return amount;
    }
}