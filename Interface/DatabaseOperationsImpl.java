package Interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseOperationsImpl implements DatabaseOperations {
    private Map<Integer, Object> database = new HashMap<>();
    private int currentId = 1;

    @Override
    public void save(Object obj) {
        database.put(currentId, obj);
        System.out.println("Saved object with ID: " + currentId);
        currentId++;
    }

    @Override
    public void delete(int id) {
        if (database.containsKey(id)) {
            database.remove(id);
            System.out.println("Deleted object with ID: " + id);
        } else {
            System.out.println("Object with ID: " + id + " not found.");
        }
    }

    @Override
    public Object get(int id) {
        return database.get(id);
    }

    @Override
    public List<Object> getAll() {
        return new ArrayList<>(database.values());
    }

    // For testing purposes
    public static void main(String[] args) {
        DatabaseOperations dbOps = new DatabaseOperationsImpl();

        // Creating dummy objects
        String obj1 = "Object 1";
        String obj2 = "Object 2";

        // Saving objects
        dbOps.save(obj1);
        dbOps.save(obj2);

        // Getting and printing an object
        System.out.println("Get object with ID 1: " + dbOps.get(1));

        // Getting and printing all objects
        System.out.println("All objects in the database: " + dbOps.getAll());

        // Deleting an object
        dbOps.delete(1);

        // Trying to get a deleted object
        System.out.println("Get object with ID 1: " + dbOps.get(1));

        // Getting and printing all objects after deletion
        System.out.println("All objects in the database after deletion: " + dbOps.getAll());
    }
}
