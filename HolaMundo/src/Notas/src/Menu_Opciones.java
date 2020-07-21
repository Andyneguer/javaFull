import javax.swing.*;
import java.util.Scanner;

public class Menu_Opciones {
    public static void main(String[] args) {

        System.out.println("|----------------------------------|");
        System.out.println("|--SELECCIONASTE MENU DE OPCIONES--|");
        System.out.println("|----------------------------------|");

        int code=0;
        String menu="MENU DE OPCIONES \n";

        menu+="1. Ejercicio 1 Secuencial Simple\n";
        menu+="2. Ejercicio 1 Condicional Simple\n";
        menu+="3. Ejercicio 1 Condicional Doble\n";
        menu+="4. Ejercicio 1 Condicion Multiple con condicion Anidada\n";
        menu+="5. Ejercicio 1 Condicional Anidada\n";
        menu+="6. Ejercicio Ciclos Anidados\n";
        menu+="7. Ciclos Anidados\n\n";
        menu+="Ingrese una Opcion";


        Scanner an=new Scanner(System.in);
        code=Integer.parseInt(JOptionPane.showInputDialog(menu));

        switch (code){
            case 1:
                System.out.println("|----------------------------------|");
                System.out.println("|------Seleccionaste Notas Estu----|");
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
                break;

            case 2:
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
                break;

            case 3:
                System.out.println("|----------------------------------|");
                System.out.println("|------Seleccionaste Tienda--------|");
                System.out.println("|----------------------------------|");

                double valorcompra=0,descuento=0,valortotal=0;
                String men="";

                valorcompra=Double.parseDouble(JOptionPane.showInputDialog("Ingresa Valor compra"));

                if (valorcompra>=200000){
                    descuento=valorcompra*(0.5);
                    valortotal=valorcompra-descuento;
                    men="Se aplico un descuento del 50% por su compra";
                    System.out.println("descuento = " + descuento);
                    System.out.println("valortotal = " + valortotal);

                }else if(valorcompra<199999) {
                    descuento = valorcompra*0.1;
                    valortotal = valorcompra - descuento;
                    men = "Se aplico un descuento del 10% por su compra";
                    System.out.println("descuento = " + descuento);
                    System.out.println("valortotal = " + valortotal);

                }

                System.out.println("men = " + men);
                break;

            case 4:
                System.out.println("|----------------------------------|");
                System.out.println("|------Seleccionaste Negativo------|");
                System.out.println("|----------------------------------|");

                int numero;
                String mensa="";

                numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));

                if (numero<0){
                    numero=numero*-1;
                    mensa="El numero es Negativo asi que se pasa a Positivo";
                    System.out.println("numero = " + numero);
                }else if (numero>0){
                    numero=numero*(-1);
                    mensa="El numero es Positivo asi que se pasa a Negativo";
                    System.out.println("numero = " + numero);
                }
                System.out.println("mensa = " + mensa+" "+numero);
                break;

            case 5:
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

                break;

            case 6:
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
                    aument=suel*0.2;
                    suel=suel+aument;
                    System.out.println("suel = " + suel);
                    mensaj="Su Antiguedad lo hace merecedor de un aumento del 20%";
                }else if (suel<1000000 && antiguedad>=10){
                    aument=suel*0.05;
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
                break;

            case 7:
                System.out.println("|----------------------------------|");
                System.out.println("|----Selecciono Ciclos anidados----|");
                System.out.println("|----------------------------------|");

                int i,j=0,suma,cant=0,n=0;

                n=Integer.parseInt(JOptionPane
                        .showInputDialog("Ingrese la cantidad de veces a repetir"));

                do {
                    JOptionPane.showMessageDialog(null,"Inicia la sumatoria");
                    cant=Integer.parseInt(JOptionPane.
                            showInputDialog("Ingrese la cantidad de veces a sumar"));
                    i=0;
                    suma=0;
                    do {
                        suma=suma+1;
                        i++;
                    }while (i<=cant);
                    System.out.println("La suma de los "+cant+" primeros numeros");

                    j++;
                }while (j<n);
                break;
            }
        }
    }
