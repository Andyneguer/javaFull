/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Ejercicio.Persona;
import JavaConection.Conection;
import Persistencia.PersonaDAO;
import java.util.ArrayList;

/**
 *
 * @author Familia Pabon
 */
public class Main {
    
        public static void main(String[] args) {
        
        String estado="";
        Conection conn = new Conection();
        PersonaDAO persona= new PersonaDAO(conn);
        
        //Se ejecuta nuestro procedimiento almacenado
        ArrayList<Persona> lista = persona.getPersona();
        
        //Mostrar datos
        
        for(int i=0; i<lista.size();i++){
            System.out.println(lista.get(i).getCedula()
                    + lista.get(i).getNombre()
                    + lista.get(i).getTelefono());
        }
        estado = persona.insertar_Persona(2028979,"Michael Rangel","234652634");
        System.out.println(estado);
    }
    
}
