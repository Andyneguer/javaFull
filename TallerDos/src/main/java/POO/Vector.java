/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;
/**
 *
 * @author andy
 */
public class Vector {
    public static void main(String[] args) {
      
        int numeros[]=new int [100];
        
        for (int i = 0; i <numeros.length; i++) {
           
           numeros[i]=i;
           System.out.print("[" + numeros[i] + "]");
                
        }
    }
}
