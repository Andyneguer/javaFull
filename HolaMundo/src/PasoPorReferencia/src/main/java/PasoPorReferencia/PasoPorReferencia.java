/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PasoPorReferencia;
/**
 *
 * @author jaime.arboleda
 */
public class PasoPorReferencia 
{
    public static void main(String[] args)
    {
        Persona persona= new Persona();//(Constructor vacio de la clase persona lo crea por defecto)
        
        persona.cambiarNombre("Juan");
        System.out.println("valor nombre: " + persona.obtenerNombre());//Metodo obtener nombre de la clase persona
        
        modificarPersona(persona);
    }
    
    private static void modificarPersona(Persona personaArg) 
    {
        personaArg.cambiarNombre("Carlos");
    }
}
