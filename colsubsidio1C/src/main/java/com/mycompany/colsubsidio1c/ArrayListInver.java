package com.mycompany.colsubsidio1c;

import java.util.ArrayList;

public class ArrayListInver {

    public static void main(String[] args) {
        int count = 0;

        ArrayList<String> texttwo = new ArrayList<String>();
        texttwo.add("a");
        texttwo.add("b");
        texttwo.add("c");
        texttwo.add("d");

        for (int i = 0; i < texttwo.size(); i++) {
            System.out.println(texttwo.get(i));
        }

        ArrayList<String> textdouble = new ArrayList<String>();

        for (int j = texttwo.size() - 1; j >= 0; j--) {
            textdouble.add(texttwo.get(j));            
            System.out.println(texttwo.get(j));
        }

    }
}
