/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CET
 */
public class TestEmpleado1 {
    
    public static ArrayList <Empleado> empleado = new ArrayList<Empleado>();
    public static Scanner an =new Scanner (System.in);
    
    public static void main(String[] args) {  
        
        int opcion1 = 0,opcion2 = 0;
        
            
            do {
                do {
                    System.out.println("|Digite el tipo de persona  |");
                    System.out.println("|1.Operario                 |");
                    System.out.println("|2.Directivo                |");
                    System.out.println("|3.Servicios Complementarios|");
                    
                    System.out.println("|opcion1:                   |");
                    opcion1=an.nextInt();
                    
                }while  (opcion1 <1 || opcion2 >3);
                       
            switch (opcion1){
                
                case 1:
                    System.out.println("|-----------------------------------------|");
                    System.out.println("|----Que Bien Seleccionaste Operario------|");
                    System.out.println("|-----------------------------------------|");
                                        
                    System.out.print("Digite su Funcion: "); 
                    String funcion = an.next();
       
                    System.out.print("Digite numero de documento: "); 
                    int documento = an.nextInt();
                    
                    System.out.print("Digite El nombre: "); 
                    String nombre = an.next();       
                    
                    System.out.print("Ingrese numero de telefono: ");
                    int telefono=an.nextInt();
                    
                    Operario operario= new Operario(funcion,documento,nombre,telefono);
                    empleado.add(operario);
                    
                    System.out.println("Volver a hacer otra consulta inicio 0=si");
                    System.out.println("Desea salir 1=si");
                    
                    opcion2=an.nextInt();
                    
                    break;

                    
                case 2:
                    System.out.println("|-----------------------------------------|");
                    System.out.println("|----Que Bien Seleccionaste Directivo------|");
                    System.out.println("|-----------------------------------------|");
                    
                    
                        System.out.print("Digite su Tipo: "); 
                        String tipo = an.next();
       
                        System.out.print("Digite El nombre: "); 
                        String nombre1 = an.next();       

                        System.out.print("Digite numero de documento: "); 
                        int cedula = an.nextInt();
                        
                        System.out.print("Ingrese la sede donde se ubica: ");
                        String sede = an.next();
                        
                        System.out.print("Ingrese numero de telefono: ");
                        int telefono1=an.nextInt();
                        
                        Directivo directivo= new Directivo(tipo, sede, cedula, nombre1, telefono1);
                        empleado.add(directivo);
                        
                        System.out.println("Volver a hacer otra consulta inicio 0=si");
                        System.out.println("Desea salir 1=si");
                        opcion2=an.nextInt();
                    
                    break;
                    
                case 3:
                    System.out.println("|----------------------------------------------------------|");
                    System.out.println("|----Que Bien Seleccionaste Servicios Complementarios------|");
                    System.out.println("|----------------------------------------------------------|");
                                        
                    System.out.print("Digite servicio prestado: "); 
                    String servicio = an.next();
       
                    System.out.print("Digite numero de cedula: "); 
                    int cedula1 = an.nextInt();
                    
                    System.out.print("Digite nombre: "); 
                    String nombre2 = an.next();
                    
                    System.out.print("Ingrese numero de Telefono: ");
                    int telefono3=an.nextInt();
                                        
                    ServiciosComplementarios complementario= new ServiciosComplementarios(servicio,cedula1,nombre2,telefono3);
                    empleado.add(complementario);
                    
                    System.out.println("Volver a hacer otra consulta inicio 0=si");
                    System.out.println("Desea salir 1=si");
                    opcion2=an.nextInt();
                    
                    break;
            }    
        }while (opcion2 !=1);
            
            for(Empleado i:empleado){
                System.out.println(i.mostrarDatos());
        }
    }
}
