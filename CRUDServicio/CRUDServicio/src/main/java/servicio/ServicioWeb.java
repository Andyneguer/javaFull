/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.CAlumno;
import persistenciaImpl.AlumnoDAO;

@WebService(serviceName = "ServicioWeb")
public class ServicioWeb {

    AlumnoDAO objAlumDAO = new AlumnoDAO();

    @WebMethod(operationName = "ListaAlumnos")
    public List<CAlumno> listaAlumnos() {
        List lstAlumno = objAlumDAO.listar();
        return lstAlumno;
    }
    
    @WebMethod(operationName = "ListaAlumnoCodigo")
    public Object listaAlumnoCodigo(int codigoEst) {
        Object lstAlumno = objAlumDAO.listarPorCodigo(codigoEst);
        return lstAlumno;
    }
}
