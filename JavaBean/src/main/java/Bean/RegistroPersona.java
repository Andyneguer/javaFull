/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author CET
 */
public class RegistroPersona {
    
    PersonaBean persona;
    
    protected PersonaBean crearPersona(){
        
        persona = new PersonaBean();//Inicilizamos objeto
        persona.setNombre("Andres");
        persona.setEstadoCivil("Casado");
        persona.setEdad(30);
        
        return persona;
    }
    
}
