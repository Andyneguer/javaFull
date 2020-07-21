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
    
    Conexion conexion;//Interfaz de conexion

    public alumnoDAO(Conexion conexion) {
        this.conexion = conexion;
    }
    
    public ArrayList<C_alumno> getAlumno(){
        
        ArrayList<C_alumno> lista = new ArrayList<C_alumno>();
        
        ResultSet rs=null;//el resulset es el remplazo del toString
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
                //Aqui traemos los atributos creados principalmente en la clase C_alumno
                lista.add(new C_alumno(rs.getInt("codigoest"), rs.getString("nombre"), rs.getString("dir"), rs.getString("tel")));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
        return lista;       
    }//end get Alumno
    
    public String insertar_alumno(int codigoest, String nombre, String dir, String tel){
        
        String estado="";//Inserta correctamente el dato
        Connection conn = null;
        try {
            //Se vuelve a traer la conexion creada en el anterior try
            //Hacer la conexion
            Conection c= new Conection();
            //Ejecutamos la conexion
            c.getConnect();
            //Asignar la conexion
            conn = c.getConnect();
            //Llamamos Store Procedure Insertar_alumno
            CallableStatement st = conn.prepareCall("{call insertar_alumno(?,?,?,?)}");//Llamado al procedimiento almacenado
            //Asignar valores a storeProcedure
            st.setInt(1, codigoest);
            st.setString(2, nombre);
            st.setString(3, dir);
            st.setString(4, tel);
            st.execute();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        estado="Insertó con Éxito!!";
        return estado;
    }
    
}
