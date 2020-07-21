import java.util.Scanner;

public class Numero {
   
public static void main(String[] ar) {

    	Scanner bri=new Scanner(System.in);
 	int num;
	System.out.println("Ingrese un valor de 1 o 2 digitos: ");
	num=bri.nextInt();
	if(num<10){
		System.out.println("El numero tiene 1 digito");
		}
	if (num>11){
		System.out.println("El numero tiene 2 digitos");
		}
	}
}