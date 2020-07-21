
package model;

public class C_CarreraAlumno {
    
    private int codigoest;
    private int codcar;

    public C_CarreraAlumno() {
    }

    public C_CarreraAlumno(int codigoest, int codcar) {
        this.codigoest = codigoest;
        this.codcar = codcar;
    }

    public int getCodigoest() {
        return codigoest;
    }

    public void setCodigoest(int codigoest) {
        this.codigoest = codigoest;
    }

    public int getCodcar() {
        return codcar;
    }

    public void setCodcar(int codcar) {
        this.codcar = codcar;
    }
    
    public String mostrarDatos(){
        return "";
    }
}
