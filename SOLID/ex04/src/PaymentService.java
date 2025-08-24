
public class PaymentService {
    String pay(Payment p){
        return p.getProvider().pay(p);
    }
}