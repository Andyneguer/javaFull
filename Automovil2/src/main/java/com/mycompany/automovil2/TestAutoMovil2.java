package com.mycompany.automovil2;

import java.util.Scanner;

public class TestAutoMovil2 {

    public static void main(String[] args) {

        //se crea variable para capturar datos
        Scanner entrada = new Scanner(System.in);

        //se crean variables globales
        String mar = "", mod = "";

        //creacion del objeto
        Automovil2 carro = new Automovil2(mar, mod);

        //Iniciamos a pedir datos por teclado
        System.out.print("Digite el modelo: ");
        mod = entrada.next();
        //insertamos datos
        carro.setModelo(mod);

        System.out.print("Digite la marca: ");
        mar = entrada.next();
        carro.setMarca(mar);

        System.out.println(carro);

    }

}
