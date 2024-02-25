package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static DAL.dbconnector.getConn;

public class EmployeeDAO implements IEmployeeDAO {

    @Override
    public void createEmployee(String data) {
        String sql = "INSERT INTO employee (Name, Salary,OnLeave,PhoneNumber) VALUES (?, ?, ?, ?)";
        try (Connection connection = getConn();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, data);
            statement.setString(2, data);
            statement.setString(3, data);
            statement.setString(4, data);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String readEmployee(int id) {
        String sql = "SELECT Name FROM employee WHERE Id = ?";
        try (Connection connection = getConn();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getString("column1");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public void updateEmployee(int id) {
        String sql = "UPDATE employee SET Name = ?,Salary=?,OnLeave=?,PhoneNumber=? WHERE Id = ?";
        try (Connection connection = getConn();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(5, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void deleteEmployee(int id) {
        String sql = "DELETE FROM employee WHERE Id = ?";
        try (Connection connection = getConn();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
   public List<String> loadData(){

       return null;
   }

}

