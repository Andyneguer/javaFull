import java.util.Scanner;

import javax.swing.*;

public class Cla2_19j{
	
public static void main(String []args){
	
	Scanner an=new Scanner(System.in);
	int aleatorio=(int)(Math.random()*100);
	int num=0;
	int intentos=0;
	do{
		intentos++;
		System.out.println("Introduce un numero");
		num=an.nextInt();
		
		if(aleatorio<num){
			System.out.println("Mas bajo");
		}
		if(aleatorio>num){
			System.out.println("Mas alto");
		}
	}while(num!=aleatorio);
		System.out.println("Correcto");
		System.out.println("Lo has conseguido en: " + intentos + " intentos");
	}
}
	