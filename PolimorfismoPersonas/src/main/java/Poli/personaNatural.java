
package Poli;

public class personaNatural extends Personas {
    
    private String nombre, genero;

    public personaNatural(String nombre, String genero, int documento, String fechaNac, String fechaRes, String fechaAct) {
        super(documento, fechaNac, fechaRes, fechaAct);
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String visualDatos(){
        
       return "Personas: " + "Nombre: " + nombre + "Fecha Nacimiento: " + fechaNac + "Fecha de actulización: " + fechaAct;
    }
}
