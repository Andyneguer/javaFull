/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacultadBean;

/**
 *
 * @author andy
 */
public class RecibeFacultad {
    
    public static void recibeFacultad(){
        
        RegistraFacultad registro = new RegistraFacultad();
        FacultadBean facultad = registro.crearRegistro();
        
        System.out.println("Nombre Facultad: " + facultad.getNombreFacultad());
        System.out.println("Numero Estudiantes: " + facultad.getNumEstudiantes());
        System.out.println("Numero de Materias: " + facultad.getNumMaterias());
        System.out.println("Codigo: " + facultad.getCodigo());
        System.out.println("Nombre Materia: " + facultad.getNombreMateria());
    }
    
    public static void main(String[] args) {
        
        recibeFacultad();
    }    
}
