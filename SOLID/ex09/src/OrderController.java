public class OrderController {
    DatabaseService databaseService;

    public OrderController(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    void create(String id){
        databaseService.save(id);
        System.out.println("Created order: " + id);
    }
}