import java.util.Scanner;
public class TestAuto {
    
    public static void main (String[] args){
        
        Scanner entrada = new Scanner (System.in);
        int caballosMotor = 0;
        String col = null, mar = null, mod;
        
        //acciones de los objetos
                
        System.out.println ("\n digite el color: ");
        col = entrada.nextLine();
        System.out.println ("\n digite la marca: ");
        mar = entrada.nextLine();
        System.out.println ("\n digite el modelo: ");
        mod = entrada.nextLine();
        System.out.println ("\n digite los caballos de fuerza: ");
        caballosMotor = entrada.nextInt();
        
        Automovil122 carro = new Automovil122 (col , mar, mod);
        Automovil122 carro2 = new Automovil122 (caballosMotor);
        
        carro.arrancar();
        carro.acelerar(caballosMotor);
        carro.frenar();
    }
    
}
