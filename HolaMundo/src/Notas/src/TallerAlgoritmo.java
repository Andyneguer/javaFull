import javax.swing.*;

public class TallerAlgoritmo {
    public static void main(String[] args) {

        String menu="",menuDefiniciones,menuEjercicios;
        int codigoMenu;
        menu.equalsIgnoreCase("TALLER ALGORITMIA");

        menuDefiniciones="SIGNIFICADOS \n\n";
        menuDefiniciones+="1. ¿Cuales son los operadores relacionales?\n";
        menuDefiniciones+="1.1 ¿Cuales son los operadores logicos?\n";
        menuDefiniciones+="2. ¿Para que sirven los operadores relacionales y logicos?\n";
        menuDefiniciones+="3. ¿Como funcionan los operadores relacionales y logicos?\n";
        menuDefiniciones+="4. ¿Cual es la diferencia entre operadores relacionales y logicos?\n";
        menuDefiniciones+="5. ¿Cuales son los operadores relacionales?\n";
        menuDefiniciones+="6. ¿Que es una estructura secuencial, Hacer Ejemplos?\n";
        menuDefiniciones+="7. ¿Que es una estructura condicional simple, Hacer Ejemplos?\n";
        menuDefiniciones+="8. ¿Que es una estructura condicional doble, Hacer Ejemplos?\n";
        menuDefiniciones+="9. ¿Que es una estructura condicional anidada, Hacer Ejemplos?\n\n";

        codigoMenu=Integer.parseInt(JOptionPane
                .showInputDialog(menuDefiniciones+"Ingrese la respuesta a realisar"));



    }
}
