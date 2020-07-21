import java.util.Scanner;
public class Tblas {
    public static void main(String[] args) {
        Scanner an=new Scanner(System.in);
        int respuesta,i,n,num;
        System.out.println("ingrese la tabla de multiplicar que desee");
        n=an.nextInt();
        System.out.println("Ingrese hazta que numero quiere la tabla de multiplicar");
        num=an.nextInt();
        for (i=1;i<=num;i++){
            respuesta=n*i;
            System.out.println(n + "*" + i + "=" + respuesta );
        }

        while (i<=num){
            respuesta=n*i;
            System.out.println(n + "*" + i + "=" + respuesta);
            i++;
            break;
        }

        do {
            respuesta=n*i;
            System.out.println(n + "*" + i + "=" + respuesta);
            i++;
        }while (i<=num);
    }
}
