import java.util.Scanner;

public class While{

public static void main(String []args){
	
	Scanner bri=new Scanner(System.in);
	int num, x;
	System.out.println("Ingrese el numero a ver la cadena");
	num=bri.nextInt();
	x=1;
	while(x<=num){
		System.out.println(x + ",");
		x= x + 1;
		}
	}
}