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
public class Compra {
    
    public static Scanner an;
    public static double desc;
    public static double totalC;
    public static double totalP;

    public static void main(String[] args) {
        an = new Scanner(System.in);
        System.out.println("Ingrese e valor de la compra:");
        totalC = an.nextDouble();
        Compra();
        Total();
    }

    public static void Compra(){
        desc = totalC*0.15;
    }

    public static void Total(){
        totalP = desc-totalC;
        System.out.println("El total a pagar es de:" + totalP);
    }
}

