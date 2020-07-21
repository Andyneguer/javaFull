/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author CET
 */
public class RecibePersona {
    
    public static void muestraPersona(){
        RegistroPersona registro=new RegistroPersona();
        PersonaBean personBean= registro.crearPersona();
        
        System.out.println("\nNombre: " + personBean.getNombre());
        System.out.println("\nEstado Civil: " + personBean.getEstadoCivil());
        System.out.println("\nEdad: " + personBean.getEdad());
    }
    public static void main(String[] args) {
     
        muestraPersona();        
    }
}
