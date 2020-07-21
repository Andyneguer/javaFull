/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaz.IenAp;

/**
 *
 * @author CET
 */
public class Auto implements IenAp {
    
    private String modelo;

    public Auto(String modelo) {
        this.modelo = modelo;
    }

    public Auto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    @Override
    public void encender() {
        System.out.println("El auto esta encendido");
    }

    @Override
    public void apagar() {
        System.out.println("El auto esta apagado°");
    }
    
}
