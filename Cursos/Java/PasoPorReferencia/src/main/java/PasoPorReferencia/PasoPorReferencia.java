/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PasoPorReferencia;
/**
 *
 * @author AndresArboleda
 */
public class PasoPorReferencia 
{
    public static void main(String[] args)
    {
        Persona persona= new Persona();//(Constructor vacio de la clase persona lo crea por defecto)
        
        //p=persona es una variable de tipo local
        persona.cambiarNombre("Juan");
        System.out.println("valor nombre: " + persona.obtenerNombre());//Metodo obtener nombre de la clase persona
        
        //metodo modificar persona
        modificarPersona(persona);
    }
    
    // Es estatico por lo que esta dentro del metodo main
    private static void modificarPersona(Persona personaArg) 
    {
        personaArg.cambiarNombre("Carlos");
    }
}
