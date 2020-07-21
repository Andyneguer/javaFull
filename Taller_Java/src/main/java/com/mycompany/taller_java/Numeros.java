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
public class Numeros {
    //Leer 2 números; si son iguales que los multiplique, si el primero es
    //mayor que el segundo que los reste y si no, que los sume.
    
    public static void main(String[] args) {
        
    
    Scanner an = new Scanner (System.in);
    
    int num1,num2,res;
    
        System.out.println("Ingrese los numeros a consultar");
        num1=an.nextInt();
        num2=an.nextInt();
        
        if (num1 == num2) {
            res=(num1*num2);
            System.out.print("El resultado es:");
            System.out.println("res = " + res);
        }else if (num1 > num2) {
            res=(num1 - num2);
            System.out.print("El resultado es:");
            System.out.println("res = " + res);
        }else if (num1 < num2) {
            res=(num1 + num2);
            System.out.println("El resultado es:");
            System.out.println("res = " + res);
        }
    
    }
}
