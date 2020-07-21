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
public class Articulo extends Fabrica{
    
    private int codigo;
    private String nombre;
    private long precio;

    public Articulo(int codigo, String nombre, long precio, int nitFabrica, String Nombre, String Direccion) {
        super(nitFabrica, Nombre, Direccion);
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }   
}
