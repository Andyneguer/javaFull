import java.util.Scanner;

public class Mes{

public static void main(String []args){

	Scanner brito=new Scanner(System.in);
	int dia, mes, año;
	System.out.println("Ingrese numero del dia");
	dia=brito.nextInt();
	System.out.println("Ingrese numero del mes");
	mes=brito.nextInt();
	System.out.println("ingresa numero de año");
	año=brito.nextInt();
	if(mes==12 && dia==25){
		System.out.println("Feliz Navidad");
		}
	}
}
	