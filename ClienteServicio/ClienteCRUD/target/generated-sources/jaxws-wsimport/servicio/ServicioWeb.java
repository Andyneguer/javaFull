
package servicio;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicioWeb", targetNamespace = "http://Servicio/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioWeb {


    /**
     * 
     * @param apellido
     * @param codigoPersona
     * @param tel
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregar", targetNamespace = "http://Servicio/", className = "servicio.Agregar")
    @ResponseWrapper(localName = "agregarResponse", targetNamespace = "http://Servicio/", className = "servicio.AgregarResponse")
    @Action(input = "http://Servicio/ServicioWeb/agregarRequest", output = "http://Servicio/ServicioWeb/agregarResponse")
    public String agregar(
        @WebParam(name = "codigoPersona", targetNamespace = "")
        int codigoPersona,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "apellido", targetNamespace = "")
        String apellido,
        @WebParam(name = "tel", targetNamespace = "")
        String tel);

    /**
     * 
     * @return
     *     returns java.util.List<servicio.Persona>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listar", targetNamespace = "http://Servicio/", className = "servicio.Listar")
    @ResponseWrapper(localName = "listarResponse", targetNamespace = "http://Servicio/", className = "servicio.ListarResponse")
    @Action(input = "http://Servicio/ServicioWeb/listarRequest", output = "http://Servicio/ServicioWeb/listarResponse")
    public List<Persona> listar();

    public String agregar();

}