import javax.swing.*;

public class Cla2_24j{

public static void main(String []args){

	String [] paises=new String[8];
	
	for(int i=0; i<8; i++){
		
		paises[i]=JOptionPane.showInputDialog("Introduce los paises a mostrar "+ (i+1));
	}
	for(String elemento:paises){
		System.out.println("Pais: "+ elemento);
		}
	}
}