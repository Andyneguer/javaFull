import java.util.Scanner;

public class Estructura1{

public static void main(String []args){

	Scanner an=new Scanner(System.in);
	int num1, num2;
	System.out.println("Ingresar el primer numero: ");
	num1=an.nextInt();
	System.out.println("Ingresar el segundo numero: ");
	num2=an.nextInt();
	if (num1>num2){
		int suma, diferencia;
		suma=num1+num2;
		diferencia=num1-num2;
		System.out.println("La suma de los dos valores es: ");
		System.out.println(suma);
		System.out.println("La diferencia de los dos valores es: ");
		System.out.println(diferencia);
		}
		if(num1<num2){
		int producto, division;
		producto=num1*num2;
		division=num1/num2;
		System.out.println("El producto de los numeros es de: ");
		System.out.println(producto);
		System.out.println("La division de los numeros es de: ");
		System.out.println(division);
		}
	}
}