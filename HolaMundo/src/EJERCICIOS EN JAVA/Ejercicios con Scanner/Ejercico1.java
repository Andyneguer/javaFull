import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3;
        
        System.out.println("ingrese el primer numero");
        num1=sc.nextInt();
        System.out.println("ingrese el segundo numero");
        num2=sc.nextInt();
        System.out.println("ingrese el tercer numero");
        num3=sc.nextInt();
        
        
        String vec[]={"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
        
        for(int i=1;i<10;i++){
            if(num1==i){
                System.out.println(vec[i]);
            }
        }
        for(int i=1;i<10;i++){
            if(num2==i){
                System.out.println(vec[i]);
            }
        }
        for(int i=1;i<10;i++){
            if(num3==i){
                System.out.println(vec[i]);
            }
        }
        
    }
    
}
