/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Ejercicio.Empleado;
import JavaConection.Conection;
import JavaConection.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author CET
 */
public class EmpleadoDAO {

    Conexion conexion;
    
    public EmpleadoDAO(Conexion conexion){
        this.conexion = conexion;
    }
    
    public ArrayList<Empleado> getEmpleado() throws SQLException{
        
        ArrayList<Empleado> lista = new ArrayList<Empleado>();
        
        ResultSet rs=null;
        Connection conn=null;
        
        try{
            //Hacemos la conexion
            Conection c=new Conection();
            //Ejecutamos la conexion
            c.getConnect();
            //Asignmos la conexion
            conn=c.getConnect();
            //si no toca crearlo
            //Llamamos nuestro procedimiento almacenado
            CallableStatement cst= conn.prepareCall("{call listar_Empleado()}");
            //Ejecutamos el procedimiento almacenado que se hizo en el MYSQL
            cst.execute();
            
            //Asignamos datos al ResultSet
            rs=cst.getResultSet();
            
            while(rs.next()){
                     //Aqui traemos los atributos credos principalmente en la clase Persona
                lista.add(new Empleado(rs.getInt("codigo"), 
                        rs.getString("cargo"), rs.getString("funcion"),
                        rs.getInt("cedula"), rs.getString("nombre"),
                        rs.getString("telefono")));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
    public String insertar_Empleado(int codigo, String cargo, String funcion, int cedula, String nombre, String telefono){
        
        String estado="";//Insertar correctamente el dato
        Connection conn=null;//Hace referencia a la interfaz connection
        try{
            //Se vuelve a traer la conexion creada en el anterior try
            //Hacer la conexion
            Conection c=new Conection();//Hacemos referencia a la clase Conection
            //Ejecutamos la conexion
            c.getConnect();
            //Asignamos la conexion
            conn=c.getConnect();//este conn hace referencia ala clase Conection
            //Llamamos Store Procedure Insertar_persona
            CallableStatement st= conn.prepareCall("{call insertar_empleado(?,?,?,?,?,?)}");//Llamado al procedimiento almacenado
            //Asigamos valore a Store Procedure
            st.setInt(1, codigo);
            st.setString(2, cargo);
            st.setString(3, funcion);
            st.setInt(4, cedula);
            st.setString(5, nombre);
            st.setString(6, telefono);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        estado="Inserto con Éxito";
        return estado;
    }    
}
