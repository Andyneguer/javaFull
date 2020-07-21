import javax.swing.JOptionPane;

public class Cla15j{

public static void main(String []args){

	String Nombre_usuario=JOptionPane.showInputDialog("Introduce tu Nombre, por favor");
	String edad=JOptionPane.showInputDialog("Introduce la Edad, por favor");
	int edad_usuario=Integer.parseInt(edad);
	edad_usuario++;
	System.out.println("Hola " + Nombre_usuario + ".El año que viene tendras " + edad_usuario + " años");

	}
}