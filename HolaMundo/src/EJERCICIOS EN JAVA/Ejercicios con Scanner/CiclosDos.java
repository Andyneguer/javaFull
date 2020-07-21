import java.util.Scanner;

public class CiclosDos{

public static void main(String args[]){
	
	Scanner brito=new Scanner(System.in);
	int num;
	int i =0;
	int j =0;

	System.out.println("***************");
	System.out.println("Serie con for: ");
	System.out.println("***************");
	System.out.println("Ingrese numero");
	num=brito.nextInt();

	for (i=1; i<=num; i++){
		if (i < num){
			System.out.print(i + ",");
			System.out.print(j + ",");
		}else {
			System.out.print(i + ",");
			System.out.print(j);
			}
			j--;
		}
			System.out.println("");
		
			i=0;
			j=0;	


	System.out.println("*****************");
	System.out.println("Serie con while: ");
	System.out.println("*****************");
	System.out.println("Ingrese numero");
	num=brito.nextInt();

	while(i <=num){
		if (i < num){
			System.out.print(i + ",");
			System.out.print(j + ",");
		}else {
			System.out.print(i + ",");
			System.out.print(j);
		}
			i++;
			j--;
		}
			System.out.println("");
		
			i=0;
			j=0;

	System.out.println("********************");
 	System.out.println("Serie con do-while: ");
	System.out.println("********************");
	System.out.println("Ingrese numero");
	num=brito.nextInt();
	
	do{
		if (i < num){
			System.out.print(i + ",");
			System.out.print(j + ",");
		}else {
			System.out.print(i + ",");
			System.out.print(j);
		}
			i++;
			j--;			
	}while(i <=num);

	}
}



















