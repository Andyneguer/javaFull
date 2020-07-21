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
public class Directivo extends Empleado {
    
    private String tipo;
    private String sedeActual;

    public Directivo(String tipo, String sedeActual, int cedula, String nombre, int telefono) {
        super(cedula, nombre, telefono);
        this.tipo = tipo;
        this.sedeActual = sedeActual;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSedeActual() {
        return sedeActual;
    }

    public void setSedeActual(String sedeActual) {
        this.sedeActual = sedeActual;
    }

    @Override
    public String mostrarDatos(){
        return " Tiene un tipo de: " + this.tipo
                + "Su nombre es: " + this.nombre 
                + "Su numero de documento: " + this.cedula
                + "Se ubica en la cede: " + this.sedeActual
                + "telefono es: " + this.telefono;
    }
}
