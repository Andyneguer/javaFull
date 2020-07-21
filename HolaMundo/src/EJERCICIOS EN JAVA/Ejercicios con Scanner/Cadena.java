import java.util.Scanner;

public class Cadena{

public static void main(String []args){

	Scanner brito=new Scanner(System.in);
	String cadena_uno="" , subcadena="";
	int caracteres=0, x=0, y=0;  // X significa (Desde) && Y significa (Hasta)

	System.out.println("Ingresa una cadena de texto");
	cadena_uno=brito.nextLine();
		
	caracteres=cadena_uno.length();
	System.out.println("El texto "+ cadena_uno + " posee" + caracteres + "caracteres");

	System.out.println("Desde que caracter desea obtener la nueva cadena");
	x=brito.nextInt();	
	System.out.println("Hasta que caracter desea obterner la nueva cadena");
	y=brito.nextInt();

	subcadena=cadena_uno.substring(x,y);
	System.out.println("la nueva cadena de texto es: "+ subcadena);
	}
}