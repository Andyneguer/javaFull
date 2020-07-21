import java.util.Scanner;

public class N_Cifras{

public static void main(String []args){

	Scanner bri=new Scanner(System.in);
	int num;
	System.out.println("Ingrese el numero");
	num=bri.nextInt();
	if (num<10){
		System.out.println("El numero tiene un digito");
	}else if(num>=10 && num<100){
		System.out.println("El numero tiene dos digitos");
	}else if(num>=100 && num<1000){
		System.out.println("El numero contiene tres digitos");
	}else {
		System.out.println("ERROR en la entrada de datos");
		}
	}
}