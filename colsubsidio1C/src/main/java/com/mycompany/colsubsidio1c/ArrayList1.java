package com.mycompany.colsubsidio1c;

import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<Personas> person = new ArrayList<Personas>();

        Personas personauno = new Personas(11, "Guerrero");
        Personas personados = new Personas(12, "Guerrero");
        Personas personatres = new Personas(13, "Guerrero");

        person.add(personauno);
        person.add(personados);
        person.add(personatres);
        for (int i = 0; i < person.size(); i++) {
            System.out.println(person.get(i).getNombre());
            System.out.println(person.get(i).getCed());
        }
    }

}
