import java.util.Scanner;

public class SumaUno{
	public static void main(String args[]){

	Scanner an = new Scanner(System.in);
	
	String nombre ="";
	int numUno =0, numDos =0, resultado =0;

	System.out.println("¿Cual es tu nombre?");
	nombre = an.nextLine();

	System.out.println("Dame el primer valor para tu suma: ");
	numUno= an.nextInt();

	System.out.println("Dame el segundo valor para tu suma: ");
	numDos= an.nextInt();
	
	resultado= numUno + numDos;

	System.out.println("Hola " + nombre + " el resultado de tu suma es: " + resultado);
	}
}

