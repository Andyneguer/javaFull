package model;

public class CAlumno {
    
    private int codigoEst;
    private String nombre, direccion, telefono;

    public CAlumno() {
    }

    public CAlumno(int codigoEst, String nombre, String direccion, String telefono) {
        this.codigoEst = codigoEst;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getCodigoEst() {
        return codigoEst;
    }

    public void setCodigoEst(int codigoEst) {
        this.codigoEst = codigoEst;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
