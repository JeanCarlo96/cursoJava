package main.java.ordenar;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Personas
        Persona p1 = new Persona("Jean", "Marchesini", LocalDate.of(1996, Month.APRIL, 30));
        Persona p2 = new Persona("Jonathan", "Morocho", LocalDate.of(1996, Month.FEBRUARY, 21));
        Persona p3 = new Persona("Pamela", "Carlosama", LocalDate.of(1996, Month.MARCH, 22));
        Persona p4 = new Persona("Juan", "Palomeque", LocalDate.of(1996, Month.APRIL, 30));


        System.out.println("Jean para Pamela es ?: " + comparacion(p1.compareTo(p3)));
        System.out.println("Jonathan para Jean es ?: " + comparacion(p2.compareTo(p1)));
        System.out.println("Pamela para Jonathan es ?: " + comparacion(p1.compareTo(p2)));
        System.out.println("Jean para Juan es ?: " + comparacion(p1.compareTo(p4)));


    }

    public static String comparacion(Integer valor){
        if(valor == 0){
            return "Igual";
        }
        return valor > 0 ? "Mayor" : "Menor";
    }

}
