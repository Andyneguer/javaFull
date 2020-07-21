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
public class Tecnico extends Operario {
    
    private String niveEducativo;
    private int experienciaMeses;

    public Tecnico(String niveEducativo, int experienciaMeses, String Funciones, int cedula, String nombre, int telefono) {
        super(Funciones, cedula, nombre, telefono);
        this.niveEducativo = niveEducativo;
        this.experienciaMeses = experienciaMeses;
    }
    
    public String getNiveEducativo() {
        return niveEducativo;
    }

    public void setNiveEducativo(String niveEducativo) {
        this.niveEducativo = niveEducativo;
    }

    public int getExperienciaMeses() {
        return experienciaMeses;
    }

    public void setExperienciaMeses(int experienciaMeses) {
        this.experienciaMeses = experienciaMeses;
    }
    
    @Override
    public String mostrarDatos(){
        return "EL nivel educativo del tecnico es: " + this.niveEducativo
                + "cuenta con una experiencia de: " + this.experienciaMeses + " Trabajando en esta dependencia";
    }
}
