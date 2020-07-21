import java.util.Scanner;

public class Valor_Num{

public static void main(String []args){

	Scanner bri=new Scanner(System.in);
	int num1, num2, num3;
	System.out.println("Ingrese los numeros a consultar");
	num1=bri.nextInt();
	num2=bri.nextInt();
	num3=bri.nextInt();
	System.out.println("Rango de Valores");
	if(num1<num2 && num1<num3){
		System.out.println(num1);
	}else if(num2<num3){
		System.out.println(num2);
	}else {
		System.out.println(num3);
	}
	System.out.println("-");
	if(num1>num2 && num1>num3){
		System.out.println(num1);
	}else if(num2>num3){
		System.out.println(num2);
	}else { 
		System.out.println(num3);
		}
	}
}
	
	
		
	