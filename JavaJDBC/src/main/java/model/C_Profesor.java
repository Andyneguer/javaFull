
package model;

public class C_Profesor {
    
    private int codprof;
    private String nombre;
    private String dir;
    private String tel;

    public C_Profesor() {
    }

    public C_Profesor(int codprof, String nombre, String dir, String tel) {
        this.codprof = codprof;
        this.nombre = nombre;
        this.dir = dir;
        this.tel = tel;
    }

    public int getCodprof() {
        return codprof;
    }

    public void setCodprof(int codprof) {
        this.codprof = codprof;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public String mostrarDatos(){
        return "";
    }
}
