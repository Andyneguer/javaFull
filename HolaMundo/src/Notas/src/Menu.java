import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {

        int op,op2=0;

        while (op2!=1){

            System.out.println("|----------Menu----------|");
            System.out.println("| Suma(1)                |");
            System.out.println("| Resta(2)               |");
            System.out.println("| Multiplicacion(3)      |");
            System.out.println("| Division modulo(4)     |");
            System.out.println("| Fibonacci(5)           |");
            System.out.println("| Ejercicio (6)          |");
            System.out.println("| Sueldo (7)             |");
            System.out.println("| Tienda (8)             |");
            System.out.println("| Negativo (9)           |");
            System.out.println("| Numero Mayor(10)       |");
            System.out.println("| Aumento sueldo (11)    |");
            System.out.println("| Menu de Opciones (12)  |");
            System.out.println("| Salir (13)             |");
            System.out.println("|------------------------|");
            System.out.println("|-Seleccione una opcion--|");
            System.out.println("|------------------------|");

            Scanner an=new Scanner(System.in);
            int num_uno;
            int num_dos;
            int res;


            op=an.nextInt();
            System.out.println(op);

            switch (op){

                case 1:
                    System.out.println("|----------------------------------|");
                    System.out.println("|----Que bien Seleccionaste Suma---|");
                    System.out.println("|----------------------------------|");
                    System.out.println("Ingresa los numero a Sumar");
                    num_uno=an.nextInt();
                    num_dos=an.nextInt();
                    res= num_uno + num_dos;
                    System.out.println("El resultado de la suma es: "+"[" + res + "]");
                    System.out.println();
                    System.out.println("Esta seguro que desea salir 1=si");
                    System.out.println("Volver a hacer otra consulta inicio 0=si");
                    op2=an.nextInt();
                    break;

                case 2:
                    System.out.println("|----------------------------------|");
                    System.out.println("|---Que bien Seleccionaste Resta---|");
                    System.out.println("|----------------------------------|");
                    System.out.println("Ingresa los numero a Restar");
                    num_uno=an.nextInt();
                    num_dos=an.nextInt();
                    res= num_uno - num_dos;
                    System.out.println("El resultado de la resta es: "+"[" + res + "]");
                    System.out.println();
                    System.out.println("Esta seguro que desea salir 1=si");
                    System.out.println("Volver a hacer otra consulta inicio 0=si");
                    op2=an.nextInt();
                    break;

                case 3:
                    System.out.println("|------------------------------------------|");
                    System.out.println("|--Que bien Seleccionaste Multiplicación---|");
                    System.out.println("|------------------------------------------|");
                    System.out.println("Ingresa los numero a Multiplicar");
                    num_uno=an.nextInt();
                    num_dos=an.nextInt();
                    res= num_uno * num_dos;
                    System.out.println("El resultado de la multiplicacion es: "+"[" + res + "]");
                    System.out.println();
                    System.out.println("Esta seguro que desea salir 1=si");
                    System.out.println("Volver a hacer otra consulta inicio 0=si");
                    op2=an.nextInt();
                    break;

                case 4:
                    System.out.println("|--------------------------------------|");
                    System.out.println("|----Que bien Seleccionaste Division---|");
                    System.out.println("|--------------------------------------|");
                    System.out.println("Ingresa los numero a Dividir");
                    num_uno=an.nextInt();
                    num_dos=an.nextInt();
                    res= num_uno / num_dos;
                    System.out.println("El resultado de la division es: "+"[" + res + "]");
                    System.out.println();
                    System.out.println("Esta seguro que desea salir 1=si");
                    System.out.println("Volver a hacer otra consulta inicio 0=si");
                    op2=an.nextInt();
                    break;

                case 5:
                    System.out.println("|--------------------------------------|");
                    System.out.println("|---Que bien Seleccionaste Fibonacci---|");
                    System.out.println("|--------------------------------------|");
                    int num;
                    int a=0;
                    int b;
                    int c;
                    int i;

                    System.out.println("|--------------------------------------|");
                    System.out.println("Serie con for: ");
                    System.out.println("|--------------------------------------|");
                    System.out.println("que tipo de salto quieres en For");
                    b=an.nextInt();
                    System.out.println("Digite el numero");
                    num=an.nextInt();
                    for(i=0; i<num; i++){
                        if (i<num){
                            System.out.print(a +",");
                            c=a+b;
                            a=b;
                            b=c;
                        }else {
                            System.out.print(a);
                        }
                    }
                    System.out.println("");
                    i=0;
                    a=0;
                    b=num;
                    c=0;

                    System.out.println("|--------------------------------------|");
                    System.out.println("Serie con while: ");
                    System.out.println("|--------------------------------------|");
                    System.out.println("que tipo de salto quieres en While");
                    b=an.nextInt();
                    System.out.println("Digite el numero");
                    num=an.nextInt();

                    while(i <num){
                        if (i<num){
                            System.out.print(a +",");
                            c=a+b;
                            a=b;
                            b=c;
                        }else {
                            System.out.print(a);
                        }
                        i++;
                    }
                    System.out.println("");
                    i=0;
                    a=0;
                    b=num;
                    c=0;

                    System.out.println("|--------------------------------------|");
                    System.out.println("Serie con do-while: ");
                    System.out.println("|--------------------------------------|");
                    System.out.println("que tipo de salto quieres en DoWhile");
                    b=an.nextInt();
                    System.out.println("Digite el numero");
                    num=an.nextInt();

                    do{
                        if (i<num){
                            System.out.print(a +",");
                            c=a+b;
                            a=b;
                            b=c;
                        }else {
                            System.out.print(a);
                        }
                        i++;
                    }while(i<num);
                    System.out.println();
                    System.out.println("Esta seguro que desea salir 1=si");
                    System.out.println("Volver a hacer otra consulta inicio 0=si");
                    op2=an.nextInt();
                    break;

                case 6:
                    System.out.println("|----------------------------------|");
                    System.out.println("|------Seleccionaste Ejercicio-----|");
                    System.out.println("|----------------------------------|");

                    double nota1,nota2,nota3,prom;

                    nota1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa nota1: "));
                    System.out.println("nota1 = " + nota1);
                    nota2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota2: "));
                    System.out.println("nota2 = " + nota2);
                    nota3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota3: "));
                    System.out.println("nota3 = " + nota3);

                    prom=(nota1+nota2+nota3)/3;

                    String mensaje="nota1= "+nota1+"\n";
                    mensaje+="nota2= "+nota2+"\n";
                    mensaje+="nota3= "+nota3+"\n\n";
                    mensaje="El promedio es: "+prom;

                    System.out.println("mensaje = " + mensaje);
                    System.out.println("Esta seguro que desea salir 1=si");
                    System.out.println("Volver a hacer otra consulta inicio 0=si");
                    op2=an.nextInt();
                    break;

                case 7:
                    System.out.println("|----------------------------------|");
                    System.out.println("|------Seleccionaste Sueldo--------|");
                    System.out.println("|----------------------------------|");

                    double sueldo,cantHoras,totalsueldo;
                    double totalHoras;

                    sueldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese sueldo base"));
                    cantHoras=Double.parseDouble(JOptionPane.showInputDialog("Ingrese horas extras"));

                    totalHoras=cantHoras*3000;
                    totalsueldo=sueldo+totalHoras;

                    System.out.println("totalsueldo = " + totalsueldo);
                    System.out.println("Esta seguro que desea salir 1=si");
                    System.out.println("Volver a hacer otra consulta inicio 0=si");
                    op2=an.nextInt();
                    break;

                case 8:
                    System.out.println("|----------------------------------|");
                    System.out.println("|------Seleccionaste Tienda--------|");
                    System.out.println("|----------------------------------|");

                    double valorcompra=0,descuento=0,valortotal=0;
                    String men="";

                    valorcompra=Double.parseDouble(JOptionPane.showInputDialog("Ingresa Valor compra"));

                    if (valorcompra>=200000){
                        descuento=valorcompra*0.5;
                        valortotal=valorcompra-descuento;
                        men="Se aplico un descuento del 50% por su compra";
                        System.out.println("descuento = " + descuento);
                        System.out.println("valortotal = " + valortotal);

                    }else if(valorcompra<199999){
                        descuento=valorcompra*0.1;
                        valortotal=valorcompra-descuento;
                        men="Se aplico un descuento del 10% por su compra";
                        System.out.println("descuento = " + descuento);
                        System.out.println("valortotal = " + valortotal);

                    }

                    System.out.println("men = " + men);
                    System.out.println("Esta seguro que desea salir 1=si");
                    System.out.println("Volver a hacer otra consulta inicio 0=si");
                    op2=an.nextInt();
                    break;

                case 9:
                    System.out.println("|----------------------------------|");
                    System.out.println("|------Seleccionaste Negativo------|");
                    System.out.println("|----------------------------------|");

                    int numero;
                    String mensa="";

                    numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));

                    if (numero<0){
                        numero=numero*(-1);
                        mensa="El numero es Negativo asi que se pasa a Positivo";
                        System.out.println("numero = " + numero);
                    }else if (numero>0){
                        numero=numero*(-1);
                        mensa="El numero es Positivo asi que se pasa a Negativo";
                        System.out.println("numero = " + numero);
                    }
                    System.out.println("mensa = " + mensa+" "+numero);
                    System.out.println("Esta seguro que desea salir 1=si");
                    System.out.println("Volver a hacer otra consulta inicio 0=si");
                    op2=an.nextInt();
                    break;

                case 10:
                    System.out.println("|----------------------------------|");
                    System.out.println("|------Seleccionaste Negativo------|");
                    System.out.println("|----------------------------------|");

                    int num1,num2;

                    num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese num1"));
                    num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese num2"));

                    if (num1>num2){
                        System.out.println("num1 = " + num1);
                        System.out.println("num1 es mayor");
                    }else if (num2>num1){
                        System.out.println("num2 = " + num2);
                        System.out.println("num2 es mayor");
                    }
                    System.out.println("Esta seguro que desea salir 1=si");
                    System.out.println("Volver a hacer otra consulta inicio 0=si");
                    op2=an.nextInt();
                    break;

                case 11:
                    System.out.println("|----------------------------------|");
                    System.out.println("|----Selecciono Aumento salario----|");
                    System.out.println("|----------------------------------|");

                    double suel=0,aument=0;
                    String nombre="",mensaj="";
                    int antiguedad;

                    nombre=JOptionPane.showInputDialog("Ingrese el nombre del empleado");
                    suel=Double.parseDouble(JOptionPane.showInputDialog("Por Favor ingrese el sueldo"));
                    antiguedad=Integer.parseInt(JOptionPane.showInputDialog("Por Favor ingresa la antiguedad"));


                    if (suel<1000000 && antiguedad >=10){
                        aument=suel*(0.2);
                        suel=suel+aument;
                        System.out.println("suel = " + suel);
                        mensaj="Su Antiguedad lo hace merecedor de un aumento del 20%";
                    }else if (suel<1000000 && antiguedad>=10){
                        aument=suel*(0.05);
                        suel=suel+aument;
                        System.out.println("suel = " + suel);
                        mensaj="Su Antiguedad lo hace merecedor de un aumento del 5%";
                    }else if (suel>1000001 && antiguedad<10){
                        aument=suel*(0.02);
                        suel=suel+aument;
                        System.out.println("suel = " + suel);
                        mensaj="Su sueldo es uno de los mas altos asi que por su antiguedad se sube un 1%";
                    }

                    System.out.println("nombre = " + nombre+"\n\n");
                    System.out.println("mensaj = " + mensaj+"\n\n");
                    System.out.println("suel = " + suel+"\n");
                    System.out.println("aument = " + aument+"\n");
                    System.out.println("Esta seguro que desea salir 1=si");
                    System.out.println("Volver a hacer otra consulta inicio 0=si");
                    op2=an.nextInt();
                    break;

                case 12:
                    System.out.println("|----------------------------------|");
                    System.out.println("|--SELECCIONASTE MENU DE OPCIONES--|");
                    System.out.println("|----------------------------------|");

                    int code=0;
                    String menu="MENU DE OPCIONES";

                    menu+="1. Ejercicio 1 Secuencial Simple\n";
                    menu+="2. Ejercicio 1 Condicional Simple\n";
                    menu+="3. Ejercicio 1 Condicional Doble\n";
                    menu+="4. Ejercicio 1 Condicion Multiple con condicion Anidada\n";
                    menu+="5. Ejercicio 1 Condicional Anidada\n\n";
                    menu+="Ingrese una Opcion";

                /*case 13:
                    System.out.println("Salir");
                    System.out.println("|--------------------------------------|");

                    System.out.println("Gracias por preferirme");
                    System.out.println("Esta seguro que desea salir 1=si");
                    System.out.println("Volver a hacer otra consulta inicio 0=si");
                    op2=an.nextInt();
                    break;
                    default:
                        System.out.println("Opcion invalida");*/
            }
        }

        System.out.println("|-----------------------------------------|");
        System.out.println("|-----El programa se cerro con exito------|");
        System.out.println("|-----------------------------------------|");
    }
}