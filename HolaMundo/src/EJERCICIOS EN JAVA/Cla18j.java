import javax.swing.*;

public class Cla18j{

	public static void main(String args[]){

	String clave="Andres";
	String pass="";

	while (clave.equalsIgnoreCase(pass)==false){
		
		pass=JOptionPane.showInputDialog("Introducir la contrase�a");
		if(clave.equalsIgnoreCase(pass)==false){
			System.out.println("Contrase�a incorrecta");
			}
		}
		System.out.println("Contrase�a correcta. Acceso Valido");
	}
}