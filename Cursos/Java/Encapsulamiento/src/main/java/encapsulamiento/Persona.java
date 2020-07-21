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
public class Persona 
{
    private String nombre;
    private double sueldo;
    private boolean eliminado;
            
    public Persona(String nombre, double sueldo, boolean eliminado)
    {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public double getSueldo() 
    {
        return sueldo;
    }

    public void setSueldo(double sueldo) 
    {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() 
    {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) 
    {
        this.eliminado = eliminado;
    }

    @Override
    public String toString() 
    {
        return "el nombre de la persona es: " + nombre + "\n" +
               "el sueldo de la persona es: " + sueldo + 
               "la persona es dado de baja: " + eliminado;
    }
}
