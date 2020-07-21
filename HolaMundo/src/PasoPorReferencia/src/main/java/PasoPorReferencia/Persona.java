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

public class Persona 
{

    String nombre;
    
    public String obtenerNombre()
    {
        return this.nombre;
    }
    
    public void cambiarNombre(String nuevoNombre)
    {
        this.nombre=nuevoNombre;
    }
    
}
