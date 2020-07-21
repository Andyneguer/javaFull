import java.util.Scanner;

public class Cuadrado{

public static void main(String []args){

	Scanner bry=new Scanner(System.in);
	int lado;
	int superficie;
	System.out.println("Ingrese el valor del lado del cuadrado");
	lado=bry.nextInt();
	superficie=lado*lado;
	System.out.println("la superficie del cuadrado es: ");
	System.out.println(superficie);
	}
}