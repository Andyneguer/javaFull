/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author Familia Pabon
 */
public class Fabrica {
    
    private int nitFabrica;
    private String Nombre;
    private String Direccion;

    public Fabrica(int nitFabrica, String Nombre, String Direccion) {
        this.nitFabrica = nitFabrica;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
    }

    public int getNitFabrica() {
        return nitFabrica;
    }

    public void setNitFabrica(int nitFabrica) {
        this.nitFabrica = nitFabrica;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    
}
