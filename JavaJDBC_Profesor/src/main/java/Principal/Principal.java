/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import JavaConection.Conection;
import Persistencia.ProfesorDAO;
import java.util.ArrayList;
import model.C_profesor;

/**
 *
 * @author CET
 */
public class Principal {
    
    public static void main(String[] args) {
        
        String estado="";
        Conection conn= new Conection();
        ProfesorDAO profesor=new ProfesorDAO(conn);
        
        //Se ejecuta nuestro procedimiento almacenado
        ArrayList<C_profesor> lista = profesor.getProfesor();
        
        for (int i = 0; i <lista.size(); i++) {
            System.out.println(lista.get(i).getCodprof() + 
                    "\t" + lista.get(i).getNombre() + 
                    "\t" + lista.get(i).getDir() + 
                    "\t" + lista.get(i).getTel());
        }
        estado= profesor.insertar_profesor(2121, "Maria Camila", "Cra 114", "3212361688");
        System.out.println(estado);
    }
}
