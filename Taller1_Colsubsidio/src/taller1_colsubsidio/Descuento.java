/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1_colsubsidio;

/**
 *
 * @author usuario
 */
public class Descuento {
    
    public double calcularDescuento(double valorSinDescuento, double descuento){
        
        return valorSinDescuento - (valorSinDescuento * (descuento/100));
    }
    
}
