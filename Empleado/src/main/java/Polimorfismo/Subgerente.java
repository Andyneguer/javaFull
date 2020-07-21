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
public class Subgerente extends Directivo{
    
    private int numPersonasCargo;
    private String areaResponsable;

    public Subgerente(int numPersonasCargo, String areaResponsable, String tipo, String sedeActual, int cedula, String nombre, int telefono) {
        super(tipo, sedeActual, cedula, nombre, telefono);
        this.numPersonasCargo = numPersonasCargo;
        this.areaResponsable = areaResponsable;
    }

    public int getNumPersonasCargo() {
        return numPersonasCargo;
    }

    public void setNumPersonasCargo(int numPersonasCargo) {
        this.numPersonasCargo = numPersonasCargo;
    }

    public String getAreaResponsable() {
        return areaResponsable;
    }

    public void setAreaResponsable(String areaResponsable) {
        this.areaResponsable = areaResponsable;
    }

    @Override
    public String mostrarDatos() {
        return "Subgerente: " + "tiene: " + numPersonasCargo + " numero de personas a cargo" 
                + " Y tiene a cargo: " + areaResponsable;
    }
}
