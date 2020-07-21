import java.util.Scanner;

public class Operario{

public static void main(String []args){

	Scanner brito=new Scanner(System.in);
	float sueldo;	
	int antiguedad;
	System.out.println("Ingrese el sueldo del empleado");
	sueldo=brito.nextFloat();
	System.out.println("Ingrese la antiguedad del empleado");
	antiguedad=brito.nextInt();
	if(sueldo <=5000000 && antiguedad>=10){
		float aumento=sueldo * 0.20f;
		float sueldoTotal = sueldo + aumento;
		System.out.println("Sueldo a pagar");
		System.out.println(sueldoTotal);
	}if(sueldo <= 5000000 && antiguedad<=10){
		float aumento = sueldo * 0.5f;
		float sueldoTotal = sueldo + aumento;
		System.out.println("Sueldo a pagar");
		System.out.println(sueldoTotal);
	}if(sueldo >=8000000){
		System.out.println("Sueldo a pagar");	
		System.out.println(sueldo);
		}
	}
}