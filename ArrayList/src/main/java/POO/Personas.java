/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;
/**
 *
 * @author andy
 */
public class Personas {
    
    private int cedula;
    private String nombre;

  
    public Personas (int cedula, String nombre){
        
        this.cedula= cedula;
        this.nombre= nombre;
    }
    
    public int getCedula (){
        
        return cedula;
    }
    public void setCedula (int cedula){
    
        this.cedula=cedula;
    }
    
    public String getNombre (){
    
        return nombre;
    }
    
    public void setNombre (String nombre){
    
        this.nombre=nombre;
    }

}
