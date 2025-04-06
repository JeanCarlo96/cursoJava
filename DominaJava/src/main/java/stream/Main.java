package main.java.stream;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Object[] miArray = Stream.of(8, 15, -3, 24, -99)
                .sorted()
                .toArray();

        Optional<Integer> producto = Stream.of(-4, -2, 55, 25, 67, 10)
                .sorted()
                .reduce((a, b) -> a * b);

        System.out.println("El producto final es: " + producto.get());

        int suma = IntStream.of(4, 8, 16)
                .sorted()
                .sum();

        System.out.println("La suma final es " + suma);

        boolean mayor = IntStream.of(2, 4, 6, 8, 10, 12, -99)
                .sorted()
                .anyMatch(i -> i > 12);

        System.out.println("Hay algún elemento mayor que 10? " + mayor);

        boolean allMayor = IntStream.of(2, 4, 6, 8, 10, 12, -99)
                .sorted()
                .allMatch(i -> i > 12);

        System.out.println("Son todos los números mayor que 10? " + allMayor);

    }

}
