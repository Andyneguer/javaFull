
package modelo;



public class Persona {
    private int codigoPersona;
    private String nombre;
    private String apellido;
    private String tel;

    
     public Persona(){
     
     }
     
    public Persona(int codigoPersona, String nombre, String apellido, String tel) {
        this.codigoPersona = codigoPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tel = tel;
    }

    public int getCodigoPersona() {
        return codigoPersona;
    }

    public void setCodigoPersona(int codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
 
    
}
