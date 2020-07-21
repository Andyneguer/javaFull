
package Servicio;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Persona;
import modelo.PersonaDAO;


@WebService(serviceName = "ServicioWeb")
public class ServicioWeb {
    PersonaDAO daop= new PersonaDAO();
    
    @WebMethod(operationName = "listar")
    public List<Persona> listar() {
        List datos= daop.listar();
        return datos;
    }
}
