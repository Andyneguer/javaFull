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
public class Television implements IenAp{
    
    private String modelo;

    public Television(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void encender() {
        System.out.println("El televisor esta encendido");
    }

    @Override
    public void apagar() {
        System.out.println("El televisor esta apagado");
    }
}
