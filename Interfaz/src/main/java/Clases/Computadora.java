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
public class Computadora implements IenAp {

    private String modelo;

    public Computadora(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void encender() {
        System.out.println("El computador esta encendido");
    }

    @Override
    public void apagar() {
        System.out.println("El computador esta apagado");
    }
    
}
