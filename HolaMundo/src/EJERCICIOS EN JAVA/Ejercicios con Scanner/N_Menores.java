import java.util.Scanner;

public class N_Menores{

public static void main(String []args){

	Scanner brito=new Scanner(System.in);
	int num1, num2, num3;
	System.out.println("Ingresa num1");
	num1=brito.nextInt();
	System.out.println("ingresa num2");
	num2=brito.nextInt();
	System.out.println("ingresa num3");
	num3=brito.nextInt();
	if(num1<10 && num2<10 && num3<10){
		System.out.println("Todos los numeros son menores a 10");
		}
	}
}