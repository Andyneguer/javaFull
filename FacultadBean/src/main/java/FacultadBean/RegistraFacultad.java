/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacultadBean;

import java.util.Scanner;

/**
 *
 * @author andy
 */
public class RegistraFacultad {
    
    public static Scanner an = new Scanner(System.in);
    
    FacultadBean facultad;
    
    protected FacultadBean crearRegistro(){
        
        facultad = new FacultadBean();
        String nombreFacultad;
        System.out.println("Ingrese el nombre de la facultad: ");
        facultad.setNombreFacultad(nombreFacultad=an.next());
        int numEstudiantes;
        System.out.println("Ingrese el numero de estudiantes: ");
        facultad.setNumEstudiantes(numEstudiantes=an.nextInt());
        int numMaterias;
        System.out.println("Ingrese el numero de materias: ");
        facultad.setNumMaterias(numMaterias=an.nextInt());
        int Codigo;
        System.out.println("Ingrese codigo de estudiante: ");
        facultad.setCodigo(Codigo=an.nextInt());
        String nombreMateria;
        System.out.println("Ingrese el nombre de la materia: ");
        facultad.setNombreMateria(nombreMateria=an.next());
        
        return facultad;
        
    }
    
    
}
