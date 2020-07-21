package javaConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {
    
    private static final String userName = "root";
    private static final String password = "";
    private static final String conString = "jdbc:mysql://localhost:3306/matricula_bd";
    
    public Connection getConection() {
        
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(conString, userName, password);
            System.out.println("Exitosa");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
