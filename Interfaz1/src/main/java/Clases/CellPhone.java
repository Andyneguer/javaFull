/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Interfaz1.Iphone;

/**
 *
 * @author CET
 */
public class CellPhone implements Iphone {

    
    
    public CellPhone(int i) {
        System.out.println(i);        
    }

    public CellPhone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dlaNumber(int Number) {
      
    }

    @Override
    public boolean isCallinProgress() {
        return false;
    }
    
}
