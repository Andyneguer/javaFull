
package javaConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection implements Conexion{
    
    private static String username="root";
    private static String password="";
    private static String conn_string="jdbc:mysql://localhost:3306/matricula_BD?serverTimezone=UTC";
    
    @Override
    public Connection getConect() {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(conn_string, username, password);
            System.out.println("Conexión Exitosa!!");
        } catch (SQLException e) {
            System.err.println("Error de MySQL: "+ e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Error de formato de clase");
        } catch (Exception e) {
            System.err.println("e");
        }

        
        return conn;
    }
    
    
    
}
