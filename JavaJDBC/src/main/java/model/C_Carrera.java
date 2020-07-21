
package model;

public class C_Carrera {
    
    private int codcar;
    private String descripcion;

    public C_Carrera() {
    }

    public C_Carrera(int codcar, String descripcion) {
        this.codcar = codcar;
        this.descripcion = descripcion;
    }

    public int getCodcar() {
        return codcar;
    }

    public void setCodcar(int codcar) {
        this.codcar = codcar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
