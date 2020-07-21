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
public class Empleado {
    
    protected int cedula;
    protected String nombre;
    protected int telefono;

    public Empleado(int cedula, String nombre, int telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String mostrarDatos(){
        return "Ingrese Numero de Documento: " + this.cedula 
                + " Ingrese su Nombre completo: " + this.nombre
                + " Ingrese un numero telefonico: " + this.telefono;
    }
}
