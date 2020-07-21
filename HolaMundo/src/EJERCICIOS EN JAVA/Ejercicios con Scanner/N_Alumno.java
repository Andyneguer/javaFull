import java.util.Scanner;

public class N_Alumno{

public static void main(String []args){

	Scanner bri=new Scanner(System.in);
	int nota1, nota2, nota3, promedio;
	System.out.println("Ingresa la nota1");
	nota1=bri.nextInt();
	System.out.println("Ingresa la nota2");
	nota2=bri.nextInt();
	System.out.println("Ingresa la nota3");
	nota3=bri.nextInt();
	promedio=(nota1+nota2+nota3)/3;
	if (promedio>=80){
		System.out.println("EXCELENTE pasaste por tus meritos");
	}if (promedio>=65 && promedio<=79){
		System.out.println("Pasaste muy regular esfuerzate un poco mas");
	}if (promedio<=64){
		System.out.println("PERDISTE tienes que repetir año nuevamente");
		}
	}
}