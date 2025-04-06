package main.java.genericos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Object miObjeto = new Object();
        Integer miInteger = 22;
        miObjeto = miInteger;

        Number miNumero = miInteger;

        ArrayList<Number> miLista = new ArrayList<>();
        miLista.add(miNumero);
        miLista.add(miInteger);

        mostrarLista(miLista);

        ArrayList<Integer> miOtraLista = new ArrayList<>();
        miOtraLista.add(miInteger);

        mostrarLista(miOtraLista);

    }

    public static void mostrarLista(ArrayList<? super Integer> lista){
        for(Object object: lista){
            System.out.println(object);
        }
    }

}
