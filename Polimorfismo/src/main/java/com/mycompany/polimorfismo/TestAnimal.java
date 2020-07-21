
package com.mycompany.polimorfismo;

import java.util.ArrayList;

public class TestAnimal {
    
    public static void main (String [] args){
    
        Animal ruf = new Perro ();
        Gato simba = new Gato ();
        Perro trosky = new Perro ();
        
        ArrayList<Animal> nombre = new ArrayList<Animal>();
        
        nombre.add(simba);
        nombre.add(trosky);
        nombre.add(ruf);
        
        for (Animal ani:nombre){
        
            ani.expresarse();
        }
    }
    
}
