import javax.swing.*;

public class Cla18j{

	public static void main(String args[]){

	String clave="Andres";
	String pass="";

	while (clave.equalsIgnoreCase(pass)==false){
		
		pass=JOptionPane.showInputDialog("Introducir la contraseņa");
		if(clave.equalsIgnoreCase(pass)==false){
			System.out.println("Contraseņa incorrecta");
			}
		}
		System.out.println("Contraseņa correcta. Acceso Valido");
	}
}