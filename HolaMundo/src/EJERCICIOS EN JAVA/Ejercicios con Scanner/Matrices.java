import java.util.Scanner;

public class MatricesDinamicas{

public static void main(String args[]){

	Scanner an=new Scanner(System.in);
	int filas=0;
	int columnas=0;
	int contador=1;
	

	System.out.println("�Cuantas filas deseas?: ");
	filas = an.nextInt(); 

	System.out.println("�Cuantas columnas deseas?: ");
	columnas = an.nextInt();

	int num[][]=new int [filas][columnas];
	
	for(int i=0; i<filas; i++){
	    for(int j=0; j<columnas; i++){
		num[i][j]=contador;
	contador ++
	System.out.print("[" + num[i][j] + "]");
	}
	System.out.print("");
	}
	}
}