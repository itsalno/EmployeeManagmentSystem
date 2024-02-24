package DAL;

import java.sql.*;


public class dbconnector {
    private static final String JDBC_URL = "";

    //type the user and password everytime
    private static final String USER = "";
    private static final String PASSWORD = "";




    public static Connection getConn() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    }
}
