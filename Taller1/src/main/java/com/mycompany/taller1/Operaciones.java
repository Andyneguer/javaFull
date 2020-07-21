/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller1;

/**
 *
 * @author CET
 */
public class Operaciones {
    //Fcatorial con funciones 
    
    /*public static int factorialNumero(int num){
        int res=1;
        
        for (int i = 1; i <=num; i++) {
            res = res * i;
        }        
        return res;
    }
    
    
    // potenci de un numero
    public static int potenciaNumero(int base, int exponente){
        int res=1;
        for (int i = 1; i<exponente; i++) {
            
            res= res * base;
        }   
            
            return res;
    }*/
    
    //numero impar 1-49
    
    public static void impar(){
        
        int impar=-1;
        for (int i = 0; i<49; i++) {
            
            impar = impar +2;
            i++;
            System.out.print(impar + ",");
            
        }
    }
    
    public static void main(String[] args) {
        
        impar();
    }
    
}
