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
public class supermercado {
    
    public static int supermercado(int descuento){
        
        Scanner an = new Scanner(System.in);
           int res=0;

        System.out.println("Ingrese el monto de la compra");
        //int compra = an.nextInt();
        int compra = 0;

        if (compra>=1000){
            System.out.println("compras = " + compra);
            System.out.println("Usted tiene derecho al 8% de su compra");

            descuento=(compra*8)/100;
            System.out.println("descuento = " + descuento);

            int totalPrecio = compra-descuento;
            System.out.println("totalprecio = " + totalPrecio);
        }
        if (compra<1000){
            System.out.println("Su compra no tiene descuento");

            int totalPrecio = compra;
            System.out.println("totalprecio = " + totalPrecio);
            
        }
        return res;
    }
    
    public static void main(String[] args) {
        
        Scanner an = new Scanner(System.in);
        int compra;
        //Scanner comp = new Scanner(System.in);
        
        System.out.println("\nDigite DesceCompra: ");
        compra=an.nextInt(); 
        
        supermercado(compra);
        
    }
    
}
