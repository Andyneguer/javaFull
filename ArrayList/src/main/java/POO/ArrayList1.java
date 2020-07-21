/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import java.util.ArrayList;

/**
 *
 * @author andy
 */
public class ArrayList1 {
      public static void main (String [] args) {
        
        ArrayList <Personas> person = new ArrayList <Personas>();
        Personas personauno = new Personas (11,"Guerrero ");
        Personas personados = new Personas (11,"Guerrero ");
        Personas personatres = new Personas (11,"Guerrero ");
   
        person.add(personauno);
        person.add(personados);
        
            for (int i = 0; i < person.size(); i++){
                System.out.print(person.get(i).getNombre());
                System.out.print(person.get(i).getCedula());
        }
    }
}