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
public class Empleado extends Persona
{
    private int idEmpleado;
    private float sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre, float sueldo)
    {
        super(nombre);
        this.idEmpleado = ++contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() 
    {
        return idEmpleado;
    }
    
    public double getSueldo() 
    {
        return sueldo;
    }

    public void setSueldo(float sueldo) 
    {
        this.sueldo = sueldo;
    }

    public static int getContadorEmpleado() 
    {
        return contadorEmpleado;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "El idEmpleado es: " + idEmpleado + " y" +
                                  " Tiene un sueldo de: " + sueldo;
    }    
}
