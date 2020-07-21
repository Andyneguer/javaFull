import java.util.Scanner;

public class Valores_Num{

public static void main(String []args){

	Scanner an=new Scanner(System.in);
	int num1, num2, num3, num4, suma, promedio;
	System.out.println("Ingrese el primer numero");
	num1=an.nextInt();
	System.out.println("Ingrese el segundo numero");
	num2=an.nextInt();
	System.out.println("Ingrese el tercer numero");
	num3=an.nextInt();
	System.out.println("Ingrese el cuarto numero");
	num4=an.nextInt();
	suma=num1+num2+num3+num4;
	promedio=suma/4;
	System.out.println("El resultado de la suma es: ");
	System.out.println(suma);
	System.out.println("El promedio es: ");
	System.out.println(promedio);
	}
}
	


