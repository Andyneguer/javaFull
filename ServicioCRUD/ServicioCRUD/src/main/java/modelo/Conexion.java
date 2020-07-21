/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static String username="root";
    private static String password="";
    private static String conn_string="jdbc:mysql://localhost:3306/compañia";
    public Connection getConect() {
        Connection conn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection(conn_string, username, password);
            System.out.println("Conexión Exitosa!");
        }
        catch(SQLException e){
            System.out.println("Errorrrrr de MySQL");
        }
        catch(Exception e){
            System.err.println(e);
        }
        
        return conn;
    }
}
