/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PalabraNull;
/**
 *
 * @author AndresArboleda
 */
public class PalabraNull
{
    public static void main(String[] args)
    {
        Persona p1 = new Persona("Andres");
        System.out.println("Nombre p1: " + p1.obtenerNombre());//Metodo obtener nombre 
        
        Persona p2 = p1;//Dos variables que apuntan a nuestro mismo objeto
        System.out.println("Nombre p2: " + p2.obtenerNombre());
        
        p1 = null;// ya no apunta a ningun objeto esto nos enviaria un error en la condicion if 
        if (p1 != null) 
        {
            System.out.println("Nombre p1: " + p1.obtenerNombre());
        }
        else
        {
            System.out.println("La variable p1 no apunta a ningun objeto");    
        }
        
        p2 = null;
        System.gc();
        // este es el recolector de basura GARBAGE COLLECTOR 
        //solo podemos planificar la llamada para recolectar objetos
        //que ya no estan sendo apunados por ninguna variable
    }
}

class Persona
{
    String nombre;//Valor por default es null
    
    public Persona(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String obtenerNombre()
    {
        return this.nombre; //uso opcional de this
        //Nombre es el atributo de la clase
    }
}