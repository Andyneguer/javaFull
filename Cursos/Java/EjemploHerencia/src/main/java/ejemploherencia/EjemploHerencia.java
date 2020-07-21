/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class EjemploHerencia 
{
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Andres", 1000000000F);
        empleado.setEdad(26);
        empleado.setGenero('M');
        empleado.setDireccion("cra 114d#151-82");
        System.out.println(empleado);
        
        Empleado empleado2 = new Empleado("Camila", 1000000000F);
        empleado2.setEdad(5);
        empleado2.setGenero('F');
        empleado2.setDireccion("cra 114d#151-82");
        System.out.println(empleado2);
        
        Cliente cliente = new Cliente(new Date(),true);
        cliente.setNombre("Brito");
        cliente.setEdad(20);
        cliente.setGenero('F');
        cliente.setDireccion("cra 114d#151-82");
        System.out.println(cliente);
    }
}
