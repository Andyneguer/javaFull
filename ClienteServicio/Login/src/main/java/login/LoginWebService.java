/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author CET
 */
@WebService(serviceName = "LoginWebService")
public class LoginWebService {

    /**
     * This is a sample web service operation
     * @param user
     * @param pass
     * @return 
     */
      @WebMethod(operationName = "Login")
    public String Login(@WebParam(name = "user") String user, @WebParam(name= "password") String pass) {
        String res;
        
        if ("Andres".equalsIgnoreCase(user) && "3524".equals(pass)) {
            res = "Conexion Exitosa";
        }
        else 
            res="Conexion Erronea";
        
        return res;
    }
}
