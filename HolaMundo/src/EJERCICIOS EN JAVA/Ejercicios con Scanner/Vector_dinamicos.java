import java.util.Scanner;

public class Vector_dinamicos{

public static void main(String args[]){

	Scanner an=new Scanner(System.in);
	int longitud=0;
	
	System.out.print("¿Cuantos numeros deseas ingresar?: ");
	longitud=an.nextInt();

	int numeros[]=new int [longitud];

	for (int i=0; i<numeros.length; i++){
	System.out.println("Por favor dame el valor #" + (i + 1) );
	numeros[i]=an.nextInt();
	}
	for (int i=0; i<numeros.length; i++){
	System.out.print("[" + numeros[i] + "]" );
	}
    }
}