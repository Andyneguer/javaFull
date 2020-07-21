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
public class Persona 
{
    private int idPersona;
    //Esto si se asocia con un objeto(osea la instancia)
    
    private String nombre;
    //Esto si se asocia con un objeto(osea la instancia)
    
    private static int contadorPersonas;
    //Esto quiere decir que esto se asocia a la clase mas no a los objetos//

    public Persona(String nombre) 
    {
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }

    public int getIdPersona()
    {
        return idPersona;
    }

    //public void setIdPersona(int idPersona) 
    //{
    //    this.idPersona = idPersona;
    //}
    
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() 
    {
        return contadorPersonas;
    }

    //public static void setContadorPersonas(int contadorPersonas) 
    //{
    //    Persona.contadorPersonas = contadorPersonas;
    //}

    @Override
    public String toString() {
        return "El idPersona es: " + idPersona + "\n"+ 
               "nombre: " + nombre + "\n";
    }
    
    
}
