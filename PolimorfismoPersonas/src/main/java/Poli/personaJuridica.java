
package Poli;

public class personaJuridica extends Personas{
    
    private String razonSocial, Dir;

    public personaJuridica(String razonSocial, String Dir, int documento, String fechaNac, String fechaRes, String fechaAct) {
        super(documento, fechaNac, fechaRes, fechaAct);
        this.razonSocial = razonSocial;
        this.Dir = Dir;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDir() {
        return Dir;
    }

    public void setDir(String Dir) {
        this.Dir = Dir;
    }
    
     public String visualDatos(){
        
       return "Personas: " + "Razón Social: " + razonSocial + "Direccion: " + Dir + "Fecha Nacimiento: " + fechaNac + "Fecha de actulización: " + fechaAct;
    }
    
}
