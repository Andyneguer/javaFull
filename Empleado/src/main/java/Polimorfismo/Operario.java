/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;
/**
 *
 * @author CET
 */
public class Operario extends Empleado{
    
    private String Funciones;

    public Operario(String Funciones, int cedula, String nombre, int telefono) {
        super(cedula, nombre, telefono);
        this.Funciones = Funciones;
    }

    public String getFunciones() {
        return Funciones;
    }

    public void setFunciones(String Funciones) {
        this.Funciones = Funciones;
    }
    
    @Override
    public String mostrarDatos(){
        return "Funciones que realiza el Opeario es: " + this.Funciones 
                + "Su numero de documento es: " + this.cedula 
                + "Su nombre es: " + this.nombre + "El telefono es: " + this.telefono;
    }
}
