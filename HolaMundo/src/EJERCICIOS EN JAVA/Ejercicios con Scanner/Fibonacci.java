import java.util.Scanner;

public class Fibonacci{

public static void main(String args[]){
	
	Scanner brito=new Scanner(System.in);
	int num;	
	int a=0;
	int b;
	int c=0;
	int i=0;
	
	System.out.println("***************");
	System.out.println("Serie con for: ");
	System.out.println("***************");
	System.out.println("que tipo de salto quieres en For");
	b=brito.nextInt();
	System.out.println("Digite el numero");
	num=brito.nextInt();
	for(i=0; i<num; i++){
		if (i<num){
		System.out.print(a +",");
		c=a+b;
		a=b;
		b=c;	
		}else { 	
		System.out.print(a);
		}
	}
	System.out.println("");
	i=0;
	a=0;
	b=num;
	c=0;
	
	System.out.println("*****************");
	System.out.println("Serie con while: ");
	System.out.println("*****************");
	System.out.println("que tipo de salto quieres en While");
	b=brito.nextInt();
	System.out.println("Digite el numero");
	num=brito.nextInt();
	
	while(i <num){
		if (i<num){
		System.out.print(a +",");
		c=a+b;
		a=b;
		b=c;	
		}else { 	
		System.out.print(a);
		}
                i++;
	}
        System.out.println("");
	i=0;
	a=0;
	b=num;
	c=0;
        
        System.out.println("********************");
	System.out.println("Serie con do-while: ");
	System.out.println("********************");
	System.out.println("que tipo de salto quieres en DoWhile");
	b=brito.nextInt();
	System.out.println("Digite el numero");
	num=brito.nextInt();
		    
        do{
            if (i<num){
		System.out.print(a +",");
		c=a+b;
		a=b;
		b=c;	
		}else { 	
		System.out.print(a);
		}
                i++;
        }while(i<num);
    }

}