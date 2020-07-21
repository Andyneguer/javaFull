/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.ArrayList;

import java.util.ArrayList;
/**
 *
 * @author andy
 */
public class Arraylist11 {
    
    public static void main(String[] args) {
        
        ArrayList<Letrass> letras = new ArrayList<>();
        Letrass a = new Letrass('A');
        Letrass b = new Letrass('B');
        Letrass c = new Letrass('C');
        Letrass d = new Letrass('D');
        
        letras.add(a);
        letras.add(b);
        letras.add(c);
        letras.add(d);
      
        for (int i = letras.size(); i >0; i--) {
            System.out.println(letras.get(i-1).getLetra());
        }
    } 
}