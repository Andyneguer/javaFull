
package principal;

import java.util.ArrayList;
import java.util.Scanner;
import javaConnection.Conection;
import model.C_Alumno;
import persistencia.Alumno_DAO;

public class main {
    
    private static Conection con = new Conection();
    private static Alumno_DAO alumDao = new Alumno_DAO(con);
    private static String estado;
    
    public static void main(String[] args) {
        
        //Creación de menú de opciones
        Scanner scan = new Scanner(System.in);
        int opt;
        
        do{
            System.out.println("---------MENÚ PRINCIPAL-------\n"
                            + "________________________________\n"
                            + "1) Listar alumnos\n"
                            + "2) Insertar alumno\n"
                            + "3) Eliminar alumno\n"
                            + "4) Actualizar alumno\n"
                            + "0) Terminar ejecución");
            opt = scan.nextInt();
            if(opt==1){
                listarAlumnos();
            }else if(opt==2){
                insertarAlumno();
            }else if(opt==3){
                eliminarAlumno();
            }else if(opt==4){
                actualizarAlumno();
            }else if(opt==0){
                System.out.println("HASTA LA PRÓXIMA!");
            }else {
                System.out.println("OPCIÓN INCONRRECTA!");
            }
        }while(opt!=0);
    }
    
    private static void listarAlumnos(){
        ArrayList<C_Alumno> arrayA;
        //Obtener lista de alumnos
        arrayA = alumDao.listar_alumnos();

        for (C_Alumno c_Alumno : arrayA) {
            System.out.println(c_Alumno.mostrarDatos());
        }
    }
    
    private static void insertarAlumno(){
        int codigo;
        String nombre, dir, tel;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite código");
        codigo = scan.nextInt();
        scan.nextLine();
        System.out.println("Digite nombre");
        nombre = scan.nextLine();
        System.out.println("Digite dirección");
        dir = scan.nextLine();
        System.out.println("Digite teléfono");
        tel = scan.nextLine();
        
        System.out.println("codigo: " + codigo + nombre + dir + tel);
        
        C_Alumno alumno = alumDao.insertarAlumno(codigo, nombre, dir, tel);
        if(alumno != null){
            System.out.println("ALUMNO AGREGADO EXITOSAMENTE!!\n" + alumno.mostrarDatos());
        }else{
            System.out.println("ERROR AL INSERTAR EL ALUMNO");
        }
                
    }
    
    private static void eliminarAlumno(){
        int codigo;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite código");
        codigo = scan.nextInt();
        
        estado = alumDao.eliminarAlumno(codigo);
        System.out.println(estado);
        
    }
    
    private static void actualizarAlumno(){
        int codigo;
        String nombre, dir, tel;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite código");
        codigo = scan.nextInt();
        scan.nextLine();
        System.out.println("Digite nombre");
        nombre = scan.nextLine();
        System.out.println("Digite dirección");
        dir = scan.nextLine();
        System.out.println("Digite teléfono");
        tel = scan.nextLine();
        
        estado = alumDao.actualizarAlumno(codigo, nombre, dir, tel);
        System.out.println(estado);
        
    }
}
