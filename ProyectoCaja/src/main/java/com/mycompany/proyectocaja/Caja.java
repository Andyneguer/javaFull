/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocaja;

/**
 *
 * @author jaime.arboleda
 */
public class Caja {
    
    public int ancho;
    public int alto;
    public int profundo;

    public Caja() 
    {
        System.out.println("Ejecutamos constructor vacio");
    }

    public Caja(int ancho, int alto, int profundo) 
    {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        System.out.println("Ejecutamos constructor con argumentos");
    }
    
    public int calcularVolumen()
    {
        return this.alto * this.ancho * this.profundo;
    }
    
    
    public int calcularVolumen(int ancho, int alto, int profundo) 
    {
        return ancho * alto * profundo;
    }
}
