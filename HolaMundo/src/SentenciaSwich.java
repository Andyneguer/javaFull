import java.util.Scanner;

public class SentenciaSwich {
    // Exercise # 22
    public static void main(String[] args) {
        //Sentencias de control Switch
        Scanner sc=new Scanner(System.in);
        var numero=Integer.parseInt(sc.nextLine());
        var texto="numero desconocido";

        switch (numero){

            case 1:
                System.out.println("numero es ;" + numero);
                texto="numero Uno" ;
                break;
            case 2:
                System.out.println("nuemero es = " + numero);
                texto="numero Dos";
                break;
            case 3:
                System.out.println("nuemero = " + numero);
                texto="numero Tres";
                break;
                default:
        }
        System.out.println("texto = " + texto);
    }
}
