import java.util.Scanner;

public class N_Menor2{

public static void main(String []args){

	Scanner brito=new Scanner(System.in);
	int num1, num2, num3;
	System.out.println("Ingrese los numeros");
	num1=brito.nextInt();
	num2=brito.nextInt();
	num3=brito.nextInt();
	if(num1<10 || num2<10 || num3<10){
		System.out.println("Los numeros son inferiores a 10");
	}if(num1<10){
		System.out.println("Uno de estos numeros es menor y es: ");
		System.out.println(num1);
	}if(num2<10){
		System.out.println("Uno de estos numeros es menor y es: ");
		System.out.println(num2);
	}if(num3<10) {
		System.out.println("Uno de estos numeros es menor y es: ");
		System.out.println(num3);
		}
	}
}