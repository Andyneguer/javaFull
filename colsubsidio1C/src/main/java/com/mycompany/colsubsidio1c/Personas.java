
package com.mycompany.colsubsidio1c;

public class Personas {

    private int Ced;
    private String Nombre;

    public Personas(int Ced, String Nombre) {
        this.Ced = Ced;
        this.Nombre = Nombre;
    }

    public int getCed() {
        return Ced;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setCed(int Ced) {
        this.Ced = Ced;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

}
