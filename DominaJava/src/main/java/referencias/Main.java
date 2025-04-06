package main.java.referencias;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        BinaryOperator<Integer> suma = Calculadora::sumar;
        System.out.println("La suma de 2 y 3 es " + suma.apply(2, 3));

        String miString = "Hola me llamo Jean";
        Supplier<String> mayusculas = miString::toUpperCase;
        System.out.println("miString en mayúsculas es: " + mayusculas.get());

        UnaryOperator<String> constructorDeStrings = String::new;
        String unString = constructorDeStrings.apply("Casa");
        String otroString = constructorDeStrings.apply("Perro");

    }

}
