/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOArray;
/**
 *
 * @author andy
 */
public class Array {
    
    public static void main(String[] args) {
               
        int num[]= new int[5];
        int num2[]= new int[5];
        
        for (int i = 0; i <= 5; i++) {
            num[i] = i+1;
        }
        
        for (int i = 0; i <= num.length; i++) {
            System.out.println("array1["+i+"] = " + num[i]);
        }
        
        for (int i = 5; i >= 0; i--) {
            num2[num2.length-i] = num[i-1];
        }
        
        for (int i = 0; i <= num2.length; i++) {
            System.out.println("array2["+i+"] = " + num2[i]);
        }
    }
}