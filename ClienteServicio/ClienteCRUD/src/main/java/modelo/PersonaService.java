/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import servicio.Persona;

/**
 *
 * @author CET
 */
public class PersonaService {

    public PersonaService() {
    }
    
    public List<Persona>listar(){
    
    servicio.ServicioWeb_Service service = new servicio.ServicioWeb_Service();
    servicio.ServicioWeb port = service.getServicioWebPort();
    
    return port.listar();
    }
    
    public String agregar(int codigoPersona,String nombre,String apellido,String tel){
    
    servicio.ServicioWeb_Service service = new servicio.ServicioWeb_Service();
    servicio.ServicioWeb port = service.getServicioWebPort();
    
    return port.agregar(codigoPersona,nombre,apellido,tel);
    }

    
}
