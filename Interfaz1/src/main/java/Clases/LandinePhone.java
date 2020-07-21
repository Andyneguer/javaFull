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
public class LandinePhone implements Iphone {

    public LandinePhone(int i) {
        System.out.println(i);
    }

    @Override
    public void dlaNumber(int Number) {
        
    }

    @Override
    public boolean isCallinProgress() {
        return false;
    }
    
}
