/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller_java;

import java.util.Scanner;

/**
 *
 * @author andy
 */
public class supermercado1 {
    
    public static Scanner an;
    public static double compra;
    public static double descuento;
    public static double totalCompra;
    
    public static void main(String[] args) {
        
        supermercado1(totalCompra);
        
    }
     public static double supermercado1(double compra){
        
        System.out.println("Ingrese el monto de la compra");      

        if (compra>=1000){
            System.out.println("compras = " + compra);
            System.out.println("Usted tiene derecho al 10% de su compra");

            descuento=(compra*10)/100;
            System.out.println("descuento = " + descuento);

            totalCompra=compra-descuento;
            System.out.println("totalprecio = " + totalCompra);
        }
        if (compra<1000){
            System.out.println("su compra no tiene descuento");

            totalCompra =compra;
            System.out.println("totalprecio = " + totalCompra);
            
        }
        return totalCompra;
    }
}
