
package persistencia;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javaConnection.Conection;
import javaConnection.Conexion;
import model.C_Alumno;

public class Alumno_DAO {
    
    Conexion conexion;

    public Alumno_DAO(Conexion conexion) {
        this.conexion = conexion;
    }
    
    public ArrayList<C_Alumno> listar_alumnos(){
        ArrayList<C_Alumno> listaAl = new ArrayList<>();
        
        Connection con = null;
        
        ResultSet rs = null;
        
        try {
            //Hacer la conexión
            Conection c = new Conection();
            //Ejecutar y asignar la conexión
            con = c.getConect();            
            //Llamamos procedimiento almacenado
            CallableStatement cst = con.prepareCall("{CALL mostrar_tabla_alumno()}");
            //Ejecutar el procedimiento
            cst.execute();
            //Asignar datos a ResultSet
            rs = cst.getResultSet();
            
            while(rs.next()){
                listaAl.add(new C_Alumno(rs.getInt("codigoest"), rs.getString("nombre"), rs.getString("dir"), rs.getString("tel")));
            }
            
            rs.close();
            con.close();
            
        } catch (Exception e) {
            System.out.println("Ocurrió algún error: " + e.getMessage());
        }
        
        
        return listaAl;
    }
    
    public C_Alumno insertarAlumno(int codigo, String nombre, String dir, String tel){
        C_Alumno alumno = null;
        
        Connection con = null;
        
        int agregado = 0;
        
        try {
            alumno = new C_Alumno(codigo, nombre, dir, tel);
            //Hacer la conexión
            Conection c = new Conection();
            //Ejecutar y asignar la conexión
            con = c.getConect();            
            //Llamamos procedimiento almacenado
            CallableStatement cst = con.prepareCall("{CALL insertar_alumno(?,?,?,?)}");
            //Asignar valores al StoreProcedure
            cst.setInt(1, alumno.getCodigoest());
            cst.setString(2, alumno.getNombre());
            cst.setString(3, alumno.getDir());
            cst.setString(4, alumno.getTel());
            //Ejecutar el procedimiento
            agregado = cst.executeUpdate();
            
            
        } catch (Exception e) {
            System.out.println("Ocurrió algún error: " + e.getMessage());
        }
        
        if(agregado>0)
            return alumno;
        else
            return null;
    }
    
    public String eliminarAlumno(int codigo){
        String estado = null;
        
        Connection con = null;
        
        int eliminado = 0;
        
        try {
            //Hacer la conexión
            Conection c = new Conection();
            //Ejecutar y asignar la conexión
            con = c.getConect();            
            //Llamamos procedimiento almacenado
            CallableStatement cst = con.prepareCall("{CALL eliminar_alumno(?)}");
            //Asignar valores al StoreProcedure
            cst.setInt(1, codigo);
            //Ejecutar el procedimiento
            eliminado = cst.executeUpdate();
            
            if (eliminado > 0) 
                estado = "EL ALUMNO CON CÓDIGO " + codigo + " FUE ELIMINADO!";
            else
                estado = "El alumno con código " + codigo + " NO pudo ser Eliminado.";
        } catch (Exception e) {
            System.out.println("Ocurrió algún error: " + e.getMessage());
            estado = "El alumno con código " + codigo + " NO pudo ser Eliminado.";
        }
        
        return estado;
    }
    
    public String actualizarAlumno(int codigo, String nombre, String dir, String tel){
        String estado = null;
        
        Connection con = null;
        
        int actualizado = 0;
        
        try {
            //Hacer la conexión
            Conection c = new Conection();
            //Ejecutar y asignar la conexión
            con = c.getConect();            
            //Llamamos procedimiento almacenado
            CallableStatement cst = con.prepareCall("{CALL actualizar_alumno(?,?,?,?)}");
            //Asignar valores al StoreProcedure
            cst.setInt(1, codigo);
            cst.setString(2, nombre);
            cst.setString(3, dir);
            cst.setString(4, tel);
            //Ejecutar el procedimiento
            actualizado = cst.executeUpdate();
            
            if (actualizado > 0) 
                estado = "EL ALUMNO CON CÓDIGO " + codigo + " FUE ACTUALIZADO CORRECTAMENTE!";
            else
                estado = "El alumno con código " + codigo + " NO pudo ser Actualizado.";
        } catch (Exception e) {
            System.out.println("Ocurrió algún error: " + e.getMessage());
            estado = "El alumno con código " + codigo + " NO pudo ser Actualizado.";
        }
        
        return estado;
    }
}
