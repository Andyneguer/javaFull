import java.awt.*;

public class Marcapunto{
	public static void main(String args[]){
	
	Point loc= new Point(4,3);
	System.out.println("Inicio el punto en: ");
	System.out.println("x es igual a: " + loc.x);
	System.out.println("y es igual a: " + loc.y);
	
	loc.x=7;
	loc.y=6;
	System.out.println("El nuevo valor de x es: " + loc.x );
	System.out.println("El nuevo valor de y es: " + loc.y);
	}
}