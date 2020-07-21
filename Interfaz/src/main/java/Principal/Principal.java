/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Clases.Auto;
import Clases.Computadora;
import Clases.Television;
import Interfaz.IenAp;

/**
 *
 * @author CET
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Auto auto=new Auto("Nissan");
        Computadora computadora = new Computadora("Toshiba");
        Television tv = new Television("LG");
        
        System.out.println("Sin polimorfismo");
        
        auto.encender();
        auto.apagar();
        
        computadora.encender();
        computadora.apagar();
        
        tv.encender();
        tv.apagar();
        
        System.out.println("Con Polimorfismo");
        
        IenAp obj = new Television ("Sansung");
        obj.encender();
        obj.apagar();
        
        obj=new Computadora("Lenovo");
        obj.encender();
        obj.apagar();
        
        obj= new Auto("BMW");
        obj.encender();
        obj.apagar();
    }
}
