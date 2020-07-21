public class Matematicas{
	public static void main(String args[]){

	int Operaciones =1;
	int numUno=8;
	int numDos=4;
	int resultado=0;
	
	if (Operaciones ==1){
	resultado = numUno + numDos;	
	System.out.println("El resultado de la Suma es: " + resultado);
		}	else if(Operaciones ==2){
			resultado = numUno - numDos;	
			System.out.println("El resultado de la Resta es: " + resultado);
		}	else if(Operaciones ==3){
			resultado = numUno * numDos;	
			System.out.println("El resultado de la Multiplicacion es: " + resultado);
		}	else if(Operaciones ==4){
			resultado = numUno / numDos;	
			System.out.println("El resultado de la Division es: " + resultado);
		}	else {
			System.out.println("La opcion que elegiste no existe");
		}
		
	}
}