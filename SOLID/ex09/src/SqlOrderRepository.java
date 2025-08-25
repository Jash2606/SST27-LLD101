public class SqlOrderRepository implements IDatabase {
    public void save(String id){ 
        System.out.println("Saved order " + id + " to SQL"); 
    }
}
