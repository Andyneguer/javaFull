import java.util.Scanner;

public class Menu {

	public static void main(String var[]){
	
	int op,op2=0;
	int n1,n2,res;
	while (op2!=1){
		
		System.out.println("|----------Menu----------|");
		System.out.println("| Suma(1)                |");
		System.out.println("| Resta(2)               |");
		System.out.println("| Multiplicacion(3)      |");
		System.out.println("| Division modulo(4)     |");
		System.out.println("| Division real(5)       |");
		System.out.println("| Salir(6)               |");
		System.out.println("|------------------------|");
		System.out.println("|-Seleccione una opcion--|");


	Scanner sc=new Scanner (System.in);
	
	op=sc.nextInt();
	System.out.println(op);
	
	
	switch (op){
		case 1:
		    System.out.println("#Suma");
		    System.out.println("#--------------------");

		    System.out.println("ingrese el numero 1 a sumar");
		    n1=sc.nextInt(); 

		    System.out.println("ingrese el numero 2 a sumar");
		    n2=sc.nextInt();
		    res=n1+n2;
		    System.out.println("la suma de los numeros es de : ");
		    System.out.println(res);
		    System.out.println("#--------------------");
		    sc.nextInt();
		    break;
		case 2:
		    System.out.println("#Resta");
		    System.out.println("#--------------------");

		    System.out.println("ingrese el numero 1 a restar");
		    n1=sc.nextInt(); 

		    System.out.println("ingrese el numero 2 a restar");
		    n2=sc.nextInt();
		    res=n1-n2;
		    System.out.println("la resta de los numeros es de : ");
		    System.out.println(res);
		    System.out.println("#--------------------");
		    sc.nextInt();
		    break;
		case 3:
		    System.out.println("#Multiplicacion");
		    System.out.println("#--------------------");

		    System.out.println("ingrese el numero 1 a multiplicar");
		    n1=sc.nextInt(); 

		    System.out.println("ingrese el numero 2 a multiplicar");
		    n2=sc.nextInt();
		    res=n1*n2;
		    System.out.println("la multiplicacion de los numeros es de : ");
		    System.out.println(res);
		    System.out.println("#--------------------");
		    sc.nextInt();
		    break;
		case 4:
		    System.out.println("#Division %");
		    System.out.println("#--------------------");

		    System.out.println("ingrese el numero 1 a dividir %");
		    n1=sc.nextInt(); 

		    System.out.println("ingrese el numero 2 a dividir %");
		    n2=sc.nextInt();
		    res=n1%n2;
		    System.out.println("la Division % de los numeros es de : ");
		    System.out.println(res);
		    System.out.println("#--------------------");
		    sc.nextInt();
		    break;
		case 5:
		    System.out.println("#Division /");
		    System.out.println("#--------------------");

		    System.out.println("ingrese el numero 1 a dividir /");
		    n1=sc.nextInt(); 

		    System.out.println("ingrese el numero 2 a dividir /");
		    n2=sc.nextInt();
		    res=n1/n2;
		    System.out.println("la division / de los numeros es de : ");
		    System.out.println(res);
		    System.out.println("#--------------------");
		    sc.nextInt();
		    break;
		case 6:
		    System.out.println("#Salir");
		    System.out.println("#--------------------");

		    System.out.println("Gracias por preferirme");
		    System.out.println("Esta seguro que desea salir 1=si");
		    System.out.println("Volver a hacer otra consulta inicio 0=si");
		    op2=sc.nextInt();
		    break;
		}
	}
		    System.out.println("|-----------------------------------------|");
		    System.out.println("| El programa se cerro con exito          |");
		    System.out.println("|-----------------------------------------|");
	}
}