
package packservicio;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicioWeb", targetNamespace = "http://packServicio/", wsdlLocation = "http://localhost:8080/Servicio/ServicioWeb?wsdl")
public class ServicioWeb_Service
    extends Service
{

    private final static URL SERVICIOWEB_WSDL_LOCATION;
    private final static WebServiceException SERVICIOWEB_EXCEPTION;
    private final static QName SERVICIOWEB_QNAME = new QName("http://packServicio/", "ServicioWeb");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Servicio/ServicioWeb?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOWEB_WSDL_LOCATION = url;
        SERVICIOWEB_EXCEPTION = e;
    }

    public ServicioWeb_Service() {
        super(__getWsdlLocation(), SERVICIOWEB_QNAME);
    }

    public ServicioWeb_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOWEB_QNAME, features);
    }

    public ServicioWeb_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOWEB_QNAME);
    }

    public ServicioWeb_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOWEB_QNAME, features);
    }

    public ServicioWeb_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioWeb_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioWeb
     */
    @WebEndpoint(name = "ServicioWebPort")
    public ServicioWeb getServicioWebPort() {
        return super.getPort(new QName("http://packServicio/", "ServicioWebPort"), ServicioWeb.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioWeb
     */
    @WebEndpoint(name = "ServicioWebPort")
    public ServicioWeb getServicioWebPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://packServicio/", "ServicioWebPort"), ServicioWeb.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOWEB_EXCEPTION!= null) {
            throw SERVICIOWEB_EXCEPTION;
        }
        return SERVICIOWEB_WSDL_LOCATION;
    }

}
