/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author andy
 */
public class ArraySort {
    
    public static void main(String[] args) {
        
        Scanner an = new Scanner(System.in);
        
        int x[]={4,5,3,7,4,0,1,3,4,5,6,7,8,88,9,0,11,33,45,6,5,3,54,4,544,55};
        
            Arrays.sort(x);
            System.out.println(Arrays.toString(x));
            
        //Otra forma de hacer el ejercicio
        int[] Numeros =  new int[5];
        
        Numeros[0] = an.nextInt();
        Numeros[1] = an.nextInt();
        Numeros[2] = an.nextInt();
        Numeros[3] = an.nextInt();
        Numeros[4] = an.nextInt();
        
        System.out.println("");
        System.out.println("Array Desordenado");
        
        for (int i = 0; i <= Numeros.length; i++) {
            System.out.println(""+Numeros[i]);
        }
        Arrays.sort(Numeros);
        System.out.println("Array ordenado");
        
        for (int i = 0; i <= Numeros.length; i++) {
            System.out.println(""+Numeros[i]);
        }
    }    
}
