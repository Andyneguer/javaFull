/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Persistencia.alumnoDAO;
import java.util.ArrayList;
import javaConection.Conection;
import model.C_alumno;

/**
 *
 * @author CET
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Conection conn = new Conection();
        alumnoDAO alumno= new alumnoDAO(conn);
        
        ArrayList<C_alumno> lista = alumno.getAlumno();//Se ejecuta nuestro procedimiento almacenado
        
        //Mostrar datos
        
        for(int i=0; i<lista.size();i++){
            System.out.println(lista.get(i).getCodigoest() + 
                    "\t" + lista.get(i).getNombre() + 
                    "\t" + lista.get(i).getDir() + 
                    "\t" + lista.get(i).getTel());
        }
    }
}