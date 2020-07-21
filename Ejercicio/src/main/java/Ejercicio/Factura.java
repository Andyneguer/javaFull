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
public class Factura extends Articulo{
    
    private int codigof;
    private String descripcion;

    public Factura(int codigof, String descripcion, int codigo, String nombre, long precio, int nitFabrica, String Nombre, String Direccion) {
        super(codigo, nombre, precio, nitFabrica, Nombre, Direccion);
        this.codigof = codigof;
        this.descripcion = descripcion;
    }

    public int getCodigof() {
        return codigof;
    }

    public void setCodigof(int codigof) {
        this.codigof = codigof;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
