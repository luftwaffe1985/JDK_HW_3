package Interface;

import java.util.List;

public interface DatabaseOperations {
    void save(Object obj);
    void delete(int id);
    Object get(int id);
    List<Object> getAll();
}