/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javaConection.Conection;
import javaConection.Conexion;
import model.C_alumno;

/**
 *
 * @author CET
 */
public class alumnoDAO {
    
    Conexion conexion;

    public alumnoDAO(Conexion conexion) {
        this.conexion = conexion;
    }
    
    public ArrayList<C_alumno> getAlumno(){
        
        ArrayList<C_alumno> lista = new ArrayList<C_alumno>();
        
        ResultSet rs=null;
        Connection conn=null;
        try{
            //Hacemos la conexion
            Conection c= new Conection();
            //Ejecutamos la conexion
            c.getConnect();
            //Asignar la conexion
            conn=c.getConnect();
            //Llamar nuestro procedimiento Almacenado 
            CallableStatement cst = conn.prepareCall("{call listar_alumno()}");
            //Ejecutamos el procedimiento almacenado que se hizo en el mysql
            cst.execute();
            //Asignamos datos al ResulSet
            
            rs=cst.getResultSet();
            
            while(rs.next()){
                lista.add(new C_alumno(rs.getInt("codigoest"), rs.getString("nombre"), rs.getString("dir"), rs.getString("tel")));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
        return lista;       
    }
    
}
