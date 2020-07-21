import java.util.Scanner;

public class Nombre{

public static void main(String []args){

	Scanner brito=new Scanner(System.in);
	String nombre_uno="" , nombre_dos="";

	System.out.println("Ingresa el primer nombre");
	nombre_uno=brito.nextLine();
	System.out.println("Ingresa el segundo nombre");
	nombre_dos=brito.nextLine();

	if(nombre_uno.equals(nombre_dos)){
		System.out.println("Los nombres son iguales");
	} else{
		System.out.println("Los nombres son diferentes");
		}
	}
}
	