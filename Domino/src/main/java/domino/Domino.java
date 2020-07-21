/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Brillit Lorena Chala Pabon
 */
public class Domino {

    public static void main(String[] args) {
        
        int code = 0;
        int pisos = 0;
        int[] arreglo = new int[1];
        int op2 = 0;
        while (op2 != 2) {

            System.out.println("|-------------------------------------------------|");
            System.out.println("|----------------MENU DE OPCIONES-----------------|");
            System.out.println("|-------------------------------------------------|");

            String menu = "MENU DE OPCIONES \n";

            menu += "1. Ejercicio 1 TrianguloPascal\n";
            menu += "2. Ejercicio 1 Fibonacci\n";//
            menu += "3. Salir\n\n";//
            menu += "Ingrese una Opcion";

            Scanner sc = new Scanner(System.in);
            code = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (code) {
                case 1:
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--------Seleccionaste Triangulo de Pascal--------|");
                    System.out.println("|-------------------------------------------------|");

                    pisos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para realizar el triangulo de pascal"));

                    for (int i = 1; i <= pisos; i++) {
                        int[] pascal = new int[i];

                        for (int j = pisos; j > i; j--) {
                            System.out.print("  ");
                        }

                        for (int k = 0; k < i; k++) {
                            if (k == 0 || k == (i - 1)) {
                                pascal[k] = 1;
                            } else {
                                pascal[k] = arreglo[k] + arreglo[k - 1];
                            }
                            System.out.print("[" + pascal[k] + "]");
                        }
                        arreglo = pascal;
                        System.out.println();
                    }
                    op2 = Integer.parseInt(JOptionPane.showInputDialog("Desea ir al menu 1=si\nDeseas Salir 2=si"));

                    if (op2 == 2) {
                        return;
                    } else if (op2 != 2 && op2 == 1) {
                        System.out.println("El programa se cerro con exito");
                    }
                    break;

                case 2:
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|-------Seleccionaste Ejercicio 2 Fibonacci-------|");
                    System.out.println("|-------------------------------------------------|");
                    int op3 = 0;
                    while (op3 != 4) {
                        System.out.println("|----------------MENU DE FIBONACCI----------------|");
                        System.out.println("|-------------------------------------------------|");

                        String menu2 = "OPCIONES FIBONACCI \n";

                        menu2 += "1. Serie Con For\n";
                        menu2 += "2. Serie con While\n";
                        menu2 += "3. Serie con Do While\n\n";
                        int code2 = Integer.parseInt(JOptionPane.showInputDialog(menu2));
                        int num;
                        int a = 0;
                        int b;
                        int c = 0;
                        int d = 0;

                        switch (code2) {
                            case 1:
                                System.out.println("|-------------------------------------------------|");
                                System.out.println("|----------------Serie con for:-------------------|");
                                System.out.println("|-------------------------------------------------|");
                                b = Integer.parseInt(JOptionPane.showInputDialog("que tipo de salto quieres en For"));
                                System.out.println("");
                                num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));

                                for (d = 0; d < num; d++) {
                                    if (d < num) {
                                        System.out.print(a + ",");
                                        c = a + b;
                                        a = b;
                                        b = c;
                                    } else {
                                        System.out.print(a);
                                    }
                                }
                                System.out.println(" ");
                                d = 0;
                                a = 0;
                                b = num;
                                c = 0;
                                System.out.println();

                                op3 = Integer.parseInt(JOptionPane.showInputDialog("Desea ir al menu2 3=si\nDeseas Salir 4=si"));
                                if (op3 == 4) {
                                    return;
                                } else if (op3 != 3 && op3 == 4) {
                                    System.out.println("El programa se cerro con exito");
                                }
                                break;

                            case 2:
                                System.out.println("|-------------------------------------------------|");
                                System.out.println("|---------------Serie con while:------------------|");
                                System.out.println("|-------------------------------------------------|");
                                b = Integer.parseInt(JOptionPane.showInputDialog("que tipo de salto quieres en While"));
                                System.out.println("");
                                num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));

                                while (d < num) {
                                    if (d < num) {
                                        System.out.print(a + ",");
                                        c = a + b;
                                        a = b;
                                        b = c;
                                    } else {
                                        System.out.print(a);
                                    }
                                    d++;
                                }
                                System.out.println("");
                                d = 0;
                                a = 0;
                                b = num;
                                c = 0;
                                System.out.println();

                                op3 = Integer.parseInt(JOptionPane.showInputDialog("Desea ir al menu2 3=si\nDeseas Salir 4=si"));
                                if (op3 == 4) {
                                    return;
                                } else if (op3 != 3 && op3 == 4) {
                                    System.out.println("El programa se cerro con exito");
                                }
                                break;

                            case 3:
                                System.out.println("|-------------------------------------------------|");
                                System.out.println("|------------Serie con do-while:------------------|");
                                System.out.println("|-------------------------------------------------|");
                                b = Integer.parseInt(JOptionPane.showInputDialog("que tipo de salto quieres en do-While"));
                                System.out.println("");
                                num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));

                                do {
                                    if (d < num) {
                                        System.out.print(a + ",");
                                        c = a + b;
                                        a = b;
                                        b = c;
                                    } else {
                                        System.out.print(a);
                                    }
                                    d++;
                                } while (d < num);
                                System.out.println();

                                op3 = Integer.parseInt(JOptionPane.showInputDialog("Desea ir al menu 1=si\nDesea ir al menu2 3=si\nDeseas Salir 4=si"));
                                if (op3 == 4) {
                                    return;
                                } else if (op3 != 3 && op3 == 4) {
                                    System.out.println("El programa se cerro con exito");
                                }

                        }
                        if (op3 <= 2) {
                            op2 = Integer.parseInt(JOptionPane.showInputDialog("Seguro Desea Regresar al menu:\n" + "Desea ir al menu 1=si\nDeseas Salir 2=si"));
                            if (op2 == 2) {
                                return;
                            } else if (op2 != 2 && op2 == 1) {
                                System.out.println("El programa se cerro con exito");
                            }
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("|-------------------------------------------------|");
                    System.out.println("|--------------Saliendo del sistema---------------|");
                    System.out.println("|-------------Gracias Vuelve Pronto---------------|");
                    System.out.println("|-------------------------------------------------|");

                    op2 = Integer.parseInt(JOptionPane.showInputDialog("Gracias Vuelve Pronto\n"
                            + "Desea ir al menu 1=si\n"
                            + "Deseas Salir 2=si"));
                    if (op2 == 2) {
                        return;
                    } else if (op2 != 2 && op2 == 1) {
                        System.out.println("|-----------------------------------------|");
                        System.out.println("|-----El programa se cerro con exito------|");
                        System.out.println("|-----------------------------------------|");
                    }
                    break;
            }
        }
    }
}
