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
public class Oficial extends Operario {
    
    private int horasExtras;
    private int antiguedad;

    public Oficial(int horasExtras, int antiguedad, String Funciones, int cedula, String nombre, int telefono) {
        super(Funciones, cedula, nombre, telefono);
        this.horasExtras = horasExtras;
        this.antiguedad = antiguedad;
    }    

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    @Override
    public String mostrarDatos(){
        return "horas extras lavoradas: " + this.horasExtras
                + "El emplead tiene una antiguedad de: " + this.antiguedad;
    }
}
