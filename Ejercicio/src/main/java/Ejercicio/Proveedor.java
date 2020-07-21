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
public class Proveedor extends Persona{
    
    private int nitPrveedor;
    private String nombreP;
    private String contacto;

    public Proveedor(int nitPrveedor, String nombreP, String contacto, int cedula, String nombre, String telefono) {
        super(cedula, nombre, telefono);
        this.nitPrveedor = nitPrveedor;
        this.nombreP = nombreP;
        this.contacto = contacto;
    }

    public int getNitPrveedor() {
        return nitPrveedor;
    }

    public void setNitPrveedor(int nitPrveedor) {
        this.nitPrveedor = nitPrveedor;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    @Override
    public String muestraDatos() {
        return "Proveedor: " + "nitPrveedor: " + nitPrveedor 
                + "\t" + ", nombreP: " + nombreP 
                + "\t" + ", contacto: " + contacto;
    }
}
