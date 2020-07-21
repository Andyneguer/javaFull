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
public class Persona 
{
    String nombre;
    
    //Creamos un metodo de tipo string
    public String obtenerNombre()
    {
        return this.nombre;
    }
    
    //Metodo para modificar el atributo
    public void cambiarNombre(String nuevoNombre)
    {
        this.nombre=nuevoNombre;
    }   
}
