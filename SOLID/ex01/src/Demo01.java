

public class Demo01 {
    public static void main(String[] args) {
        CommunicationMethod communicationMethod = new EmailClient();
        CommunicationService communicationService = new CommunicationService(communicationMethod);
        OrderService orderService = new OrderService(communicationService);
        orderService.checkout("a@shop.com", 100.0);
    }
}
