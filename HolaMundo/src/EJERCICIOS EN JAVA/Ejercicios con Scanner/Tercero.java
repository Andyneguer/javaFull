import java.util.Scanner;

public class Tercero {

public static void main (String var[]){
	
	Scanner sc=new Scanner(System.in);
	int a;
	int b;
	
	System.out.println("ingrese el valor de a");
	a = sc.nextInt();
	
	System.out.println("ingrese el valor de b");
	b = sc.nextInt();
	
	if (a>b) {
	System.out.println("Hola \n Buenas tardes\n -\n -\n Estamos en clase de java");
	}
	
	if(a<b){
	System.out.println("ÑOÑO tendra \n \t un buen año");
	}

	if(a==b){
	System.out.println("Ingrese numeros distintos");
	}
	}
}	