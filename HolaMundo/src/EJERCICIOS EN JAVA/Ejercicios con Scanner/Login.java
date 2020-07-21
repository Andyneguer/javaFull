import java.util.Scanner;

public class Login{

public static void main(String args []){

	Scanner en=new Scanner(System.in);
	String usuario="";
	String password="";

	System.out.print("Ingresa nombre de usuario: ");
	usuario=en.nextLine();
	
	
	System.out.print("Ingresa tu contraseña de usuario: ");
	password=en.nextLine();

		if(usuario.equals("Andres") && password.equals("12/03/2018") ){
		System.out.println("inicio de sesion correcto");
	    }else{
		System.out.println("Inicio de sesion incorrecto");
	}   	
    }   
}   
