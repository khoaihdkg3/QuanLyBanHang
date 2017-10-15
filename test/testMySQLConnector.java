
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author THINH
 */
public class testMySQLConnector {
    public static Connection getMySQLConnection()
        throws ClassNotFoundException, SQLException {
    String hostName = "localhost";
    String dbName = "QuanLyBanHang";
    String userName = "root";
    String password = "12345";
    return getMySQLConnection(hostName, dbName, userName, password);
}
 
public static Connection getMySQLConnection(String hostName, String dbName,
        String userName, String password) throws SQLException,
        ClassNotFoundException {
    // Khai báo class Driver cho DB MySQL
    // Việc này cần thiết với Java 5
    // Java6 trở lên tự động tìm kiếm Driver thích hợp.
    // Nếu bạn dùng Java > 5, thì ko cần dòng này cũng được.
    Class.forName("com.mysql.jdbc.Driver");
 
    // Cấu trúc URL Connection dành cho MySQL
    // Ví dụ: jdbc:mysql://localhost:3306/simplehr
    String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
 
    Connection conn = (Connection) DriverManager.getConnection(connectionURL, userName,
            password);
    return conn;
}
    public static void main(String[] args) {
        
    }
}
