/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class PersonaDAO implements CRUD {
    PreparedStatement ps;
    ResultSet rs;
    Connection conn;
    Conexion conex= new Conexion();
    
    @Override
    public List listar() {
        List<Persona> datos= new ArrayList<>();
        String sql="SELECT * FROM persona";
        try{
            conn = conex.getConect();
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
             Persona p = new Persona();
             p.setCodigoPersona(rs.getInt("codigoPersona"));
             p.setNombre(rs.getString("nombre"));
             p.setApellido(rs.getString("apellido"));
             p.setTel(rs.getString("tel"));
             datos.add(p);
            }
        }catch(Exception e){
        }
        return datos;
    }

    @Override
    public Persona listarCod(int codigoPersona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String add(int codigoPersona, String nombre, String apellido, String tel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String edit(int codigoPersona, String nombre, String apellido, String tel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(int codigoPersona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
