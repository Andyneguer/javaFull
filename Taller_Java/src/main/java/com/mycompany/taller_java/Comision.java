/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller_java;

/**
 *
 * @author andy
 */
public class Comision {
    
        public double comision(double totalVentas, double porcentajeComision){
        
        System.out.println("total ventas: " + totalVentas 
                           + "\nporcentaje: "+porcentajeComision 
                           + "calculo: "+ (porcentajeComision/100));
        
        return totalVentas * (porcentajeComision/100);
    }
    
        public double sueldoNeto(double sueldoBase, double comision){
            
            return sueldoBase + comision;
    } 
}
