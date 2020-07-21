/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author Familia Pabon
 */
public class Empleado extends Persona{
    
    private int codigo;
    private String cargo;
    private String funcion;

    public Empleado(int codigo, String cargo, String funcion, int cedula, String nombre, String telefono) {
        super(cedula, nombre, telefono);
        this.codigo = codigo;
        this.cargo = cargo;
        this.funcion = funcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String muestraDatos() {
        return "Empleado: " + "codigo: " + codigo 
                + "\t" + ", cargo: " + cargo 
                + "\t" + ", funcion: " + funcion;
    }   
}
