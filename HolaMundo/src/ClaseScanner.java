import java.util.Scanner;

public class ClaseScanner {
    // Exercise # 4 ----
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingresa tu usuario");
        String usuario = sc.nextLine();
        System.out.println("Ingresa el saludo");
        String saludar = sc.nextLine();
        System.out.println(saludar + " " + usuario);

        /*
        // Escribe tu solucion aqui
        String titulo = sc.nextLine();
        System.out.println("El titulo del libro es: " + titulo);
        String autor = sc.nextLine();
        System.out.println("El autor del libro es: " + autor);
        System.out.println(titulo + "Fue escrito por " + autor);
        */
    }
}
