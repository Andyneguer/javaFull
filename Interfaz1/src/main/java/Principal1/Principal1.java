/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal1;

import Clases.CellPhone;
import Clases.LandinePhone;
import Clases.VideoPhone;
import Interfaz1.Iphone;
import java.util.Scanner;

/**
 *
 * @author CET
 */
public class Principal1 {
    
    public static Scanner an = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Sin Polimorfismo");
        
        CellPhone phone = new CellPhone(0);
        LandinePhone ladin = new LandinePhone(0);
        VideoPhone video = new VideoPhone(0);
        
        System.out.println("Con Polimorfismo");
        Iphone number = new CellPhone();
        int Number;
        number.dlaNumber(Number=an.nextInt());
        System.out.println(Number);
    }
}
