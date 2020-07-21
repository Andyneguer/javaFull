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
public class ConversionMoneda {
    private final double unDolarEnPesos = 3475.5;
    
    public double pesos_A_dolares(double pesos){
        return pesos / unDolarEnPesos;
    }
}
