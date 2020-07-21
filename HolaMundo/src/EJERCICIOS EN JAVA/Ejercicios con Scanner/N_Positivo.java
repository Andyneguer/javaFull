import java.util.Scanner;

public class N_Positivo{

public static void main(String []args){
	
	Scanner brito=new Scanner(System.in);
	int num;
	System.out.println("Ingresa el numero");
	num=brito.nextInt();
	if (num==0) {
	    System.out.print("Se ingresó el cero: ");
	    System.out.print("O Se ingresó un valor negativo");
	}else {
	if (num>0) {
	        System.out.print("Se ingresó un valor positivo");
	}else{
	        System.out.print("Se ingresó un valor negativo");	
	}
	}
	}
}