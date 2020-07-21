/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author CET
 */
public class Conection implements Conexion {

    private static String username="root";
    private static String password="";
    private static String conn_string="jdbc:mysql://localhost:3306/matricula";
    
    
    @Override
    public Connection getConnect() {
    
        Connection conn=null;//conn es el nombre que uno quiera colocar
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(conn_string, username,password);
            System.out.println("Conexion Exitosa!");
        }
        catch(SQLException e){
            System.out.println("Error de MYSQL");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return conn;   
    }    
}
