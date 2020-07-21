import java.util.Scanner;

public class Operaciones {

public static void main(String args[]){
	
	
	
	Scanner brito=new Scanner(System.in);
	int num_uno;
	int num_dos;
	int res;
	int op,op2=0;
	
		while (op2!=1){

		System.out.println("|----------Menu----------|");
		System.out.println("| Suma(1)                |");
		System.out.println("| Resta(2)               |");
		System.out.println("| Multiplicacion(3)      |");
		System.out.println("| Division modulo(4)     |");
		System.out.println("| Salir(5)               |");
		System.out.println("|------------------------|");
		System.out.println("|-Seleccione una opcion--|");
		
		op=brito.nextInt();
		System.out.println(op);
	
		switch (op){		
		
		case 1:
		System.out.println("|----------------------------------|");
		System.out.println("|----Que bien Seleccionaste Suma---|");
		System.out.println("|----------------------------------|");
		System.out.println("Ingresa los numero a Sumar");
		num_uno=brito.nextInt();
		num_dos=brito.nextInt();
		res= num_uno + num_dos;
		System.out.println("El resultado de la suma es: " + res);
		break;
		
		case 2:	
		System.out.println("|----------------------------------|");
		System.out.println("|---Que bien Seleccionaste Resta---|");
		System.out.println("|----------------------------------|");
		System.out.println("Ingresa los numero a Restar");
		num_uno=brito.nextInt();
		num_dos=brito.nextInt();	
		res= num_uno - num_dos;
		System.out.println("El resultado de la resta es: " + res);
		break;
		
		case 3:
		System.out.println("|------------------------------------------|");
		System.out.println("|--Que bien Seleccionaste Multiplicación---|");
		System.out.println("|------------------------------------------|");
		System.out.println("Ingresa los numero a Multiplicar");
		num_uno=brito.nextInt();
		num_dos=brito.nextInt();
		res= num_uno * num_dos;
		System.out.println("El resultado de la multiplicacion es: " + res);
		break;
		
		case 4:
		System.out.println("|--------------------------------------|");
		System.out.println("|----Que bien Seleccionaste Division---|");
		System.out.println("|--------------------------------------|");
		System.out.println("Ingresa los numero a Dividir");
		num_uno=brito.nextInt();
		num_dos=brito.nextInt();
		res= num_uno / num_dos;
		System.out.println("El resultado de la division es: " + res);
		break;
		
		case 5:
		System.out.println("Salir");
		System.out.println("--------------------");

		System.out.println("Gracias por preferirme");
		System.out.println("Esta seguro que desea salir 1=si");
		System.out.println("Volver a hacer otra consulta inicio 0=si");
		op2=brito.nextInt();
		break;

		}
		}
		
		System.out.println("|-----------------------------------------|");
		System.out.println("| El programa se cerro con exito          |");
		System.out.println("|-----------------------------------------|");
	}
}	