
package modelo;

import java.util.List;

public interface CRUD {
    public List listar();
    public Persona listarCod(int codigoPersona);
    public String add(int codigoPersona, String nombre, String apellido, String tel);
    public String edit(int codigoPersona, String nombre, String apellido, String tel);
    public String delete(int codigoPersona);
}
