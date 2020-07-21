import java.util.Scanner;

public class Alumno{

public static void main(String []args){

	Scanner bri=new Scanner(System.in);
	String nombre;
	int nota1, nota2, nota3;
	System.out.println("Ingresa Nombre del alumno");
	nombre=bri.nextLine();
	System.out.println("Ingrese la nota del primer corte: ");
	nota1=bri.nextInt();
	System.out.println("Ingrese la nota del segundo corte: ");	
	nota2=bri.nextInt();
	System.out.println("Ingrese la npta del tercer corte: ");
	nota3=bri.nextInt();
	int promedio;
	promedio=(nota1 + nota2 + nota3)/3;
	if (promedio>70){
		System.out.println("Eres asombrozo sigue asi FELICIDADEZ ");
		}
		if(promedio<69){
			System.out.println("Tienes que esforzarte mas PERDISTE: ");
		}
	}
}