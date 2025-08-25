public class Demo09 {
    public static void main(String[] args) {
        // new OrderController().create("ORD-1");
        IDatabase database = new SqlOrderRepository();
        DatabaseService databaseService = new DatabaseService(database);
        OrderController orderController = new OrderController(databaseService);
        orderController.create("ORD-1");
    }
}
