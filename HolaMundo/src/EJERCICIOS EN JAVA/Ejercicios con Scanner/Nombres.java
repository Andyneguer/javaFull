import java.util.Scanner;

public class Nombres{

	public static void main(String args[]){

	String nombre_uno = "";
	String nombre_dos = "";
	Scanner en = new Scanner(System.in);

	System.out.print("Por favor ingresa el primer nombre: ");
	nombre_uno= en.nextLine();
	
	System.out.print("Por favor ingresa el segundo nombre: ");
	nombre_dos=en.nextLine();

	if (nombre_uno.equalsIgnoreCase(nombre_dos) ){
		System.out.println("Los nombres son iguales");
	}else {
	System.out.println("los nombres son diferentes");
	}

    }
	
}