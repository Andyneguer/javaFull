
package Poli;

public class Personas {
    
    protected int documento;
    protected String fechaNac, fechaRes, fechaAct;

    public Personas(int documento, String fechaNac, String fechaRes, String fechaAct) {
        this.documento = documento;
        this.fechaNac = fechaNac;
        this.fechaRes = fechaRes;
        this.fechaAct = fechaAct;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getFechaRes() {
        return fechaRes;
    }

    public void setFechaRes(String fechaRes) {
        this.fechaRes = fechaRes;
    }

    public String getFechaAct() {
        return fechaAct;
    }

    public void setFechaAct(String fechaAct) {
        this.fechaAct = fechaAct;
    }
    
    public String visualDatos() {
    
        return "Personas: " + "Documento: " + documento + "Fecha Nacimiento: " + fechaNac + "Fecha de actulización: " + fechaAct;
      
    }
  
}
