/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploestatico;
/**
 *
 * @author Andres Arboleda
 */
public class EjemploEstatico 
{
    public static void main(String[] args) 
    {
        Persona persona = new Persona("Andres");
        System.out.println(persona);
        
        Persona persona2 = new Persona("Brito");
        System.out.println(persona2);
        
        Persona persona3 = new Persona("Camila");
        System.out.println(persona3);
        
        System.out.println("contadorPersona: " + Persona.getContadorPersonas());
    }
}
