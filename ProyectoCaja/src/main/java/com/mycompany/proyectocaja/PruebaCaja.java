/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocaja;

/**
 *
 * @author andres.arboleda
 */
public class PruebaCaja {
    
    public static void main(String[] args) 
    {
        int operadorA=3;
        int operadorB=2;
        int operadorC=6;
        
        Caja caja1 = new Caja();
        
        int resultado =caja1.calcularVolumen(operadorC, operadorC, operadorC);
        System.out.println("resultado caja1 = " + resultado);
        
        Caja caja2 = new Caja(operadorC, operadorC, operadorC);
        int resultado2 = caja2.calcularVolumen(2, 4, 6);
        //Se imprime el valor de los operados
        
        System.out.println("resultado Caja2= " + resultado2);        
    }
    
}
