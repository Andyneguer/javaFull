import java.util.Scanner;

public class Sum_Pro{

public static void main(String []args){

	Scanner an=new Scanner(System.in);
	int num1, num2, num3, num4;
	int suma;
	int producto;
	System.out.println("ingrese el primer valor ");
	num1=an.nextInt();
	System.out.println("ingrese el segundo valor ");
	num2=an.nextInt();
	System.out.println("ingrese el tercer valor ");
	num3=an.nextInt();
	System.out.println("ingrese el cuarto valor ");
	num4=an.nextInt();
	suma=num1+num2;
	producto=num3/num4;
	System.out.println("la suma de los primeros valores es: ");
	System.out.println(suma);
	System.out.println("El producto de los segundos numeros es: ");
	System.out.println(producto);
	}
}
	