/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;
/**
 *
 * @author andy
 */
public class Coordinador extends Directivo{
    
    private String area;

    public Coordinador(String area, String tipo, String sedeActual, int cedula, String nombre, int telefono) {
        super(tipo, sedeActual, cedula, nombre, telefono);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String mostrarDatos() {
        return "El Coordinador esta encargado de: " + area;
    }
}
