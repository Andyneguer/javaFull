package persistenciaImpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javaConection.ConexionMySQL;
import model.CAlumno;
import persistencia.ICRUD;

public class AlumnoDAO implements ICRUD {
    
    ResultSet rs = null;
    Connection conn = null;
    ConexionMySQL conexion = new ConexionMySQL();

    @Override
    public List listar() {
        
        List<CAlumno> lstAlumno = new ArrayList();
        try {
            conn = conexion.getConection();
            CallableStatement cst = conn.prepareCall("call listar_alumno()");
            cst.execute();
            rs = cst.getResultSet();
            
            while(rs.next()) {
                CAlumno objAlumno = new CAlumno();
                objAlumno.setCodigoEst(rs.getInt("codigoest"));
                objAlumno.setNombre(rs.getString("nombre"));
                objAlumno.setDireccion(rs.getString("dir"));
                objAlumno.setTelefono(rs.getString("tel"));
                lstAlumno.add(objAlumno);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return lstAlumno;
    }

    @Override
    public Object listarPorCodigo(int codigo) {
        CAlumno objAlumno = new CAlumno();
        try {
            conn = conexion.getConection();
            CallableStatement cst = conn.prepareCall("call listar_alumno_por_codigo(?)");
            cst.setInt(1, codigo);
            while(rs.next()) {
                objAlumno.setCodigoEst(rs.getInt("codigoest"));
                objAlumno.setNombre(rs.getString("nombre"));
                objAlumno.setDireccion(rs.getString("dir"));
                objAlumno.setTelefono(rs.getString("tel"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return objAlumno;
    }

    @Override
    public String add(int codigo, String nombre, String direccion, String telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String edit(int codigo, String nombre, String direccion, String telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
