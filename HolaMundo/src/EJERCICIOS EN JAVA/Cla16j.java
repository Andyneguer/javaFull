import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cla16j{

public static void main(String []args){

		String Nombre_usuario=JOptionPane.showInputDialog("Introduce tu Nombre, por favor");
		String edad=JOptionPane.showInputDialog("Introduce la Edad, por favor");
		int edad_usuario=Integer.parseInt(edad);
		edad_usuario++;
		System.out.println("Hola " + Nombre_usuario + ".El año que viene tendras " + edad_usuario + "años");

		Scanner an=new Scanner(System.in);
			
		if(edad_usuario >=18){
			System.out.println("Ya eres mayor de edad");
		}else if(edad_usuario <18){
			System.out.println("Eres menor de edad");
			System.out.println("Aun no puedes tener novia");
		}
	}
}			
					
