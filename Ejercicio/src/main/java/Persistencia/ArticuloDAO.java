/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Ejercicio.Articulo;
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
public class ArticuloDAO {

    Conexion conexion;
    
    public ArticuloDAO(Conexion conexion){
        this.conexion = conexion;
    }
    
    public ArrayList<Articulo> getArticulo() throws SQLException{
        
        ArrayList<Articulo> lista = new ArrayList<Articulo>();
        
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
            CallableStatement cst= conn.prepareCall("{call listar_Articulo()}");
            //Ejecutamos el procedimiento almacenado que se hizo en el MYSQL
            cst.execute();
            
            //Asignamos datos al ResultSet
            rs=cst.getResultSet();
            
            while(rs.next()){
                //Aqui traemos los atributos credos principalmente en la clase Persona
                lista.add(new Articulo(rs.getInt("codigo"),rs.getString("nombre"),
                        rs.getLong("precio"),rs.getInt("nitFabrica"),
                        rs.getString("Nombre"),rs.getString("Direccion")));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
    public String insertar_Articulo(int codigo, String nombre, long precio, int nitFabrica, String Nombre, String Direccion){
        
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
            CallableStatement st= conn.prepareCall("{call insertar_Articulo(?,?,?,?,?,?)}");//Llamado al procedimiento almacenado
            //Asigamos valore a Store Procedure
            st.setInt(1, codigo);
            st.setString(2, nombre);
            st.setLong(3, precio);
            st.setInt(4, nitFabrica);
            st.setString(5, Nombre);
            st.setString(6, Direccion);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        estado="Inserto con Éxito";
        return estado;
    }    
}
