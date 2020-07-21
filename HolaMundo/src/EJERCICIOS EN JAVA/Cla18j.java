import javax.swing.*;

public class Cla18j{

	public static void main(String args[]){

	String clave="Andres";
	String pass="";

	while (clave.equalsIgnoreCase(pass)==false){
		
		pass=JOptionPane.showInputDialog("Introducir la contraseña");
		if(clave.equalsIgnoreCase(pass)==false){
			System.out.println("Contraseña incorrecta");
			}
		}
		System.out.println("Contraseña correcta. Acceso Valido");
	}
}