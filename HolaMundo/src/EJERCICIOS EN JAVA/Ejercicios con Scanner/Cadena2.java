import java.util.Scanner;

public class Cadena{
	
public static void main(String args []){
	
	String cadena_original;
	String cadena_substraccion;

	int num_caracteres=0, desde=0 ,hasta=0;
	Scanner an=new Scanner(System.in);

	System.out.print("Introduce una cadena de caracteres: ");
	cadena_original= an.nextLine();

	num_caracteres = cadena_original.length();
	
	System.out.println("La cadena de caracteres " + cadena_original +"posee" + num_caracteres + "caracteres.");

	System.out.print("¿Desde que caracter deseas obtener la nueva cadena?: ");
	desde=an.nextInt();
	System.out.print("¿Hasta que caracter deseas obtener la nueva cadena?: ");
	hasta=an.nextInt();

	cadena_substraccion= cadena_original.substring(desde,hasta);
	System.out.println("La nueva cadena es: "+ cadena_substraccion); 
	}
}