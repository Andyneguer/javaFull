package persistencia;

import java.util.List;

public interface ICRUD {
    
    public List listar();
    public Object listarPorCodigo(int codigo);
    public String add(int codigo, String nombre, String direccion, String telefono);
    public String edit(int codigo, String nombre, String direccion, String telefono);
    public String delete(int codigo);
}
