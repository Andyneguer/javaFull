/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;
/**
 *
 * @author Andres Arboleda
 */
public class PruebaPersona 
{
    public static void main(String[] args)
    {
        Persona persona = new Persona("Andres",5000000,false);
        /*
        *System.out.println("nombre persona: " + persona.getNombre());
        *System.out.println("sueldo persona: " + persona.getSueldo());
        *System.out.println("persona eliminada?: " + persona.isEliminado());
        */
        
        System.out.println("persona: " + persona.toString());
        
        persona.setNombre("Brito");
        persona.setSueldo(9000000);
        persona.setEliminado(false);
        /*System.out.println("nombre persona: " + persona.getNombre());
        *System.out.println("sueldo persona: " + persona.getSueldo());
        *System.out.println("persona eliminada?: " + persona.isEliminado());
        */
        System.out.println("persona: " + persona.toString());
    }
}
