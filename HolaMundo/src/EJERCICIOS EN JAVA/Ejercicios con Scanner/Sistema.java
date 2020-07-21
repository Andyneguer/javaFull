import java.util.Scanner;
import javax.swing.JOptionPane;

public class Sistema{

public static void main(String []args){

	Scanner brito=new Scanner(System.in);
	String Nombre="";
	int clave_U=0;
	int antiguedad_U=0;

	System.out.println("|---------------------------------------------------|");
	System.out.println("|------BIENVENIDO A COCA COLA COMPANY VACATION------|");
	System.out.println("|---------------------------------------------------|");
	System.out.println("");
	System.out.println("");
	
	System.out.println("|---------------------------------------------------|");
	System.out.println("¿Cual es el Nombre del Trabajador?");
	String Nombre_usuario=JOptionPane.showInputDialog("Ingrece el Nombre del Trabajador");
	System.out.println("");
	

	System.out.println("|---------------------------------------------------|");
	System.out.println("¿Cuantos años se encuentra laborando en la company?");
	System.out.println("|---------------------------------------------------|");
	String antiguedad=JOptionPane.showInputDialog("Introduce la antiguedad, por favor");
	antiguedad_U=Integer.parseInt(antiguedad);
	System.out.println("");
	

	System.out.println("|---------------------------------------------------|");
	System.out.println("¿A cual departamento de la compañia pertenece?");
	System.out.println("|---------------------------------------------------|");
	String clave=JOptionPane.showInputDialog("Introduce la clave, por favor");
	clave_U=Integer.parseInt(clave);
	System.out.println("");
	

	switch (clave_U){
		case 1:
			if(antiguedad_U <=1){
			System.out.println("El trabajador "+ Nombre_usuario + " Tiene Derecho a 6 dias de vacaciones");
			}if(antiguedad_U >=2 && antiguedad_U >=6){
			System.out.println("El trabajador "+ Nombre_usuario + " Tiene Derecho a 14 dias de vacaciones");
			}if(antiguedad_U >=7){
			System.out.println("El trabajador "+ Nombre_usuario + " Tiene Derecho a 20 dias de vacaciones");
			}
			break;
		case 2:
			if(antiguedad_U <=1){
			System.out.println("El trabajador "+ Nombre_usuario + " Tiene Derecho a 7 dias de vacaciones");
			}if(antiguedad_U >=2 && antiguedad_U <=6){
			System.out.println("El trabajador "+ Nombre_usuario + " Tiene Derecho a 15 dias de vacaciones");
			}if(antiguedad_U >=7){
			System.out.println("El trabajador "+ Nombre_usuario + " Tiene Derecho a 22 dias de vacaciones");
			}
			break;
		
		case 3:
			if(antiguedad_U <=1){
			System.out.println("El trabajador "+ Nombre_usuario + " Tiene Derecho a 10 dias de vacaciones");
			}if(antiguedad_U >=2 && antiguedad_U <=6){
			System.out.println("El trabajador "+ Nombre_usuario + " Tiene Derecho a 20 dias de vacaciones");
			}if(antiguedad_U >=7){
			System.out.println("El trabajador "+ Nombre_usuario + " Tiene Derecho a 30 dias de vacaciones");
			}
			break;
		default:
			System.out.println("Error!, La clave del departamento es incorrecta");
			break;
			
		}
	}
}