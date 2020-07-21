/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import JavaConection.Conection;
import JavaConection.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.C_profesor;

/**
 *
 * @author CET
 */
public class ProfesorDAO {
    
    Conexion conexion;

    public ProfesorDAO(Conexion conexion) {//Constructor de la clase
        this.conexion = conexion;
    }
    
    public ArrayList<C_profesor> getProfesor(){
        
        ArrayList<C_profesor> lista = new ArrayList<C_profesor>();
        
        ResultSet rs=null;//El ResulSet es el remplazo del toString
        Connection conn=null;
        
        try{
            //Hacemos la conexion
            Conection c=new Conection();
            //Ejecutamos la conexion
            c.getConnect();
            //Asignmos la conexion
            conn=c.getConnect();
            //Llamamos nuestro procedimiento almacenado
            CallableStatement cst= conn.prepareCall("{call listar_profesores()}");
            //Ejecutamos el procedimiento almacenado que se hizo en el MYSQL
            cst.execute();
            
            //Asignamos datos al ResultSet
            rs=cst.getResultSet();
            
            while(rs.next()){//rs es el resultset
                //Aqui traemos los atributos credos principalmente en la clase C_profesor
                lista.add(new C_profesor(rs.getInt("codprof"), rs.getString("nombre"), rs.getString("dir"), rs.getString("tel")));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return lista;
    }//end get Profesor
    
    public String insertar_profesor(int codprof, String nombre, String dir, String tel){
        
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
            //Llamamos Store Procedure Insertar_profesor
            CallableStatement st= conn.prepareCall("{call insertar_profesor(?,?,?,?)}");//Llamado al procedimiento almacenado
            //Asigamos valore a Store Procedure
            st.setInt(1, codprof);
            st.setString(2, nombre);
            st.setString(3, dir);
            st.setString(4, tel);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        estado="Inserto con Éxito";
        return estado;
    }
}
