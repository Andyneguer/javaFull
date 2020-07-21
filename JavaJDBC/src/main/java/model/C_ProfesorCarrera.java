
package model;

public class C_ProfesorCarrera {
    
    private int codprof;
    private int codcar;

    public C_ProfesorCarrera() {
    }

    public C_ProfesorCarrera(int codprof, int codcar) {
        this.codprof = codprof;
        this.codcar = codcar;
    }

    public int getCodprof() {
        return codprof;
    }

    public void setCodprof(int codprof) {
        this.codprof = codprof;
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
