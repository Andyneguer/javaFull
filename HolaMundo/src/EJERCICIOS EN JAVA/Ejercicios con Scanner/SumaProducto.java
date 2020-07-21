import java.util.Scanner;

public class SumaProducto{

public static void main(String []args){

	Scanner brito=new Scanner(System.in);
	int num1, num2, suma, producto;
	System.out.println("Ingrese el primer numero");
	num1=brito.nextInt();
	System.out.println("Ingrese el segundo numero");
	num2=brito.nextInt();
	suma=num1+num2;
	producto=num1*num2;
	System.out.println("El resultado de la suma es de: ");
	System.out.println(suma);
	System.out.println("El resultado del producto es: ");
	System.out.println(producto);
	}
}