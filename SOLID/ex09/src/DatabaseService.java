public class DatabaseService {
    IDatabase database;

    public DatabaseService(IDatabase database) {
        this.database = database;
    }

    public void save(String id) {
        database.save(id);
    }
}
