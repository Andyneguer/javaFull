import java.util.Scanner;

public class Precio{

public static void main(String []args){

	Scanner bri=new Scanner(System.in);
	int cantidad;
	float precio;
	float importe;
	System.out.println("Ingrese la cantidad de articulos a llevar");
	cantidad=bri.nextInt();
	System.out.println("Ingrese el valor unitario del producto: ");
	precio=bri.nextFloat();
	importe=precio*cantidad;
	System.out.println("El importe total a pagar es: ");
	System.out.println(importe);
	}
}
	