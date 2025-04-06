package main.java.expresionesLambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EjemploComparator {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan", "García");
        Persona persona2 = new Persona("Ana", "Martínez");
        Persona persona3 = new Persona("Laura", "Díaz");
        Persona persona4 = new Persona("Sandra", "Álvarez");

        List<Persona> lista = Arrays.asList(persona1, persona2, persona3, persona4);

        // Ordenar por nombre
        //lista.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
        lista.sort(Comparator.comparing(Persona::getApellido));
        lista.forEach(System.out::println);

    }

}
