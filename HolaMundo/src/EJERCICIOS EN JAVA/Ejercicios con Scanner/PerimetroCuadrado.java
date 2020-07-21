import java.util.Scanner;

public class PerimetroCuadrado{

public static void main(String []args){

	Scanner an=new Scanner(System.in);
	int lado, perimetro;
	System.out.println("ingresar el lado del cuadrado");
	lado=an.nextInt();
	perimetro=lado*4;
	System.out.println("El perimetro del cuadrado es de: ");
	System.out.println(perimetro);
	
	
	}
}
	