import java.util.Scanner;

public class N_Mayor{

public static void main(String []args){
	
	Scanner bri=new Scanner(System.in);
	int num1, num2, num3;
	System.out.println("Ingrese los 3 numeros: ");
	num1=bri.nextInt();
	num2=bri.nextInt();
	num3=bri.nextInt();
	if (num1>num2 && num1>num3){
		System.out.println("El num1 es mayor: ");
		System.out.println(num1);
	}if (num2>num1 && num2>num3){
		System.out.println("El num2 es mayor: ");
		System.out.println(num2);
	}if (num3>num1 && num3>num2){
		System.out.println("El num3 es mayor: ");
		System.out.println(num3);
	}
	}
}