/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.colsubsidio1c;

// El ArrayList es dinamico
import java.util.ArrayList;



public class ArrayListText {

    public static void main(String[] args) {
        ArrayList<String> texto = new ArrayList<String>();
            texto.add("a");
            texto.add("b");
            texto.add("c");
            texto.add("1");
            
            for (int i = texto.size()-1 ; i>=0; i--) {
                
                System.out.println(texto.get(i));         
        }
            
    }
}
