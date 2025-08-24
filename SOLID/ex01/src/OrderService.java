public class OrderService {
    CommunicationService communicationService;
    TaxCalculate taxCalculate;
    DatabaseService databaseService;

    public OrderService(CommunicationService communicationService) {
        this.communicationService = communicationService;
        this.taxCalculate = new TaxCalculate();
        this.databaseService = new DatabaseService();
    }
    void checkout(String customerEmail, double subtotal) {
        double total = taxCalculate.totalWithTax(subtotal);
        communicationService.send(customerEmail, "Thanks! Your total is " + total);
        databaseService.save();
    }
}