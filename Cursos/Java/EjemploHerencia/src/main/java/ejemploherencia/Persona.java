/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;
/**
 *
 * @author Andres Arboleda
 */
public class Persona 
{
    public String nombre;
    public char genero;
    public int edad;
    public String direccion;

    public Persona()
    {
    
    }
    
    public Persona(String nombre)
    {
        this.nombre = nombre;
    }    

    public Persona(String nombre, char genero, int edad, String direccion) 
    {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return  "El nombre de la persona es: " + nombre + "\n" +
                "su genero es: " + genero + "\n"+
                "su edad es de: " + edad + " años" + "\n" +
                "la direccion de su residencia es: " + direccion;
    }
}
