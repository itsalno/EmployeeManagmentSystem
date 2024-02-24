package DAL;

import java.util.List;

public interface IEmployeeDAO {

    void createEmployee(String data);
    void deleteEmployee(int id);
    void updateEmployee(int id);
    String readEmployee(int id);
    List<String> loadData();
}
