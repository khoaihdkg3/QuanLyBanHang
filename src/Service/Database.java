/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author THINH
 */
public class Database {
    private static Connection instance;
    private Database(){
        
    }
    public static Connection getInstance() throws ClassNotFoundException, SQLException{
        if(instance == null){
            Class.forName("com.mysql.jdbc.Driver");  
            instance = (Connection) DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/quanlyraucu?useUnicode=true&characterEncoding=utf-8",
                            "root",
                            "");  
        }
        return instance;
    }
    
    
}
