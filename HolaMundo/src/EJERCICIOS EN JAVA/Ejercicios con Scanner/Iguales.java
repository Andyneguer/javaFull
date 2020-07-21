import java.util.Scanner;

public class Iguales{

public static void main(String []args){

	Scanner brito=new Scanner(System.in);
	int num1, num2, num3, suma, producto;
	System.out.println("Ingrese num1");
	num1=brito.nextInt();
	System.out.println("Ingrese num2");
	num2=brito.nextInt();
	System.out.println("Ingrese num3");
	num3=brito.nextInt();
	if(num1>num2 && num1>num3){
		System.out.println("El numero mayor es: ");
		System.out.println(num1);
	}if(num2>num1 && num2>num3){
		System.out.println("El numero mayor es: ");
		System.out.println(num2);
	}if(num3>num1 && num3>num2){
		System.out.println("El numero mayor es: ");
		System.out.println(num3);		
	}if(num1>num2 && num1==num3){
		suma=(num1+num3);
		System.out.println("El valor de la suma es de: ");
		System.out.println(suma);
		producto=suma*num2;
		System.out.println("el resultado del producto es: ");
		System.out.println(producto);		
	}if(num1==num2 && num1>num3){
		suma=(num1+num2);
		System.out.println("El valor de la suma es de: ");
		System.out.println(suma);
		producto=suma*num3;
		System.out.println("el resultado del producto es: ");
		System.out.println(producto);
	}if(num2>num1 && num2==num3){
		suma=(num2+num3);
		System.out.println("El valor de la suma es de: ");
		System.out.println(suma);
		producto=suma*num1;
		System.out.println("el resultado del producto es: ");
		System.out.println(producto);
		}	
		
	}

}