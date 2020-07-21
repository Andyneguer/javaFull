import java.util.Scanner;

public class Carga_Valor{

public static void main(String []args){

	Scanner brito=new Scanner(System.in);
	int x, suma, valor, promedio;
	x=1;
	suma=0;
	while(x<=10){
		System.out.println("Ingrese un valor: ");
		valor=brito.nextInt();
		suma = suma + valor;
		x = x + 1;
		}
	promedio = suma / 10;
	System.out.println("La suma de los valores es: ");
	System.out.println(suma);
	System.out.println("El promedio es: ");
	System.out.println(promedio);
	}
}