package main.java.expresionesLambda;

import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {

        MiValor miValor = () -> 2.8;

        System.out.println("Si ejecuto miValor.obtenerValor() obtengo " + miValor.obtenerValor());

        OperadorUnario raizCuadrada = n -> Math.sqrt(n);
        System.out.println("La raiz cuadrada de 4 es " + raizCuadrada.aplicar(4));

        OperadorUnario triple = n -> 3 * n;
        System.out.println("El triple de 5 es " + triple.aplicar(3));

        OperadorBinario multiplicacion = (x, y) -> x * y;
        System.out.println("El resultado de multiplicar 5 X 6 es " + multiplicacion.aplicar(5.0, 6.0));

        OperadorBinario minimoComunMultiplo = (x, y) -> {
            double mcm;
            if(x > y){
                mcm = x;
            } else {
                mcm = y;
            }

            while(mcm % x != 0 || mcm % y != 0){
                mcm++;
            }

            return mcm;
        };

        System.out.println("El mínimo común múltiplod de 12 y 9 es " + minimoComunMultiplo.aplicar(12, 9));

        OperadorBinarioString concatenacion = (x, y) -> x.concat(y);
        System.out.println(concatenacion.aplicar("Jean", "Carlo"));

        OperadorBinarioG<String> concatena = (x, y) -> x.concat(y);
        System.out.println(concatena.aplicar("Marchesini", "Antamba"));

        // java.util.function
        BinaryOperator<Double> multiplicar = (x, y) -> x * y;
        System.out.println(multiplicar.apply(3.0,4.2));

    }

}
