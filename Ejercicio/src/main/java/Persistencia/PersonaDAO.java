/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Ejercicio.Persona;
import JavaConection.Conection;
import JavaConection.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Familia Pabon
 */
public class PersonaDAO {
   
    Conexion conexion;

    public PersonaDAO(Conexion conexion) {//Constructor de la clase
        this.conexion = conexion;
    }
    
    public ArrayList<Persona> getPersona(){
        
        ArrayList<Persona> lista = new ArrayList<Persona>();
        
        ResultSet rs=null;//El ResulSet es el remplazo del toString
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
            CallableStatement cst= conn.prepareCall("{call listar_Personas()}");
            //Ejecutamos el procedimiento almacenado que se hizo en el MYSQL
            cst.execute();
            
            //Asignamos datos al ResultSet
            rs=cst.getResultSet();
            
            while(rs.next()){//rs es el resultset
                //Aqui traemos los atributos credos principalmente en la clase Persona
                lista.add(new Persona(rs.getInt("cedula"), rs.getString("nombre"), rs.getString("telefono")));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return lista;
    }//end get Persona
    
    public String insertar_Persona(int cedula, String nombre, String telefono){
        
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
            CallableStatement st= conn.prepareCall("{call insertar_Persona(?,?,?)}");//Llamado al procedimiento almacenado
            //Asigamos valore a Store Procedure
            st.setInt(1, cedula);
            st.setString(2, nombre);
            st.setString(3, telefono);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        estado="Inserto con Éxito";
        return estado;
    }
}
