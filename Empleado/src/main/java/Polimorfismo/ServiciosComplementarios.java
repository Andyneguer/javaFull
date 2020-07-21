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
public class ServiciosComplementarios extends Empleado{
        private String tipoServicio;

    public ServiciosComplementarios(String tipoServicio, int cedula, String nombre, int telefono) {
        super(cedula, nombre, telefono);
        this.tipoServicio = tipoServicio;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    @Override
    public String toString() {
        return "ServiciosComplementarios " + "tipoServicio=" + tipoServicio 
                +"cedula: " + this.cedula + "Nombre: " + this.nombre
                + "Telefono es: " + this.telefono;
    }
        
    
}
