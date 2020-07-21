
package model;

public class C_Matricula {
    
    private int codmatric;
    private int codigoest;
    private int codcar;
    private int codprof;

    public C_Matricula() {
    }

    public C_Matricula(int codmatric, int codigoest, int codcar, int codprof) {
        this.codmatric = codmatric;
        this.codigoest = codigoest;
        this.codcar = codcar;
        this.codprof = codprof;
    }

    public int getCodmatric() {
        return codmatric;
    }

    public void setCodmatric(int codmatric) {
        this.codmatric = codmatric;
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

    public int getCodprof() {
        return codprof;
    }

    public void setCodprof(int codprof) {
        this.codprof = codprof;
    }
    
    public String mostrarDatos(){
        return "";
    }
}
