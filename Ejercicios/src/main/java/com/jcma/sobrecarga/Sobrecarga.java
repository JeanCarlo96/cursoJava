package com.jcma.sobrecarga;
import static com.jcma.sobrecarga.Calculadora.*;

public class Sobrecarga {

    public static void main(String[] args) {

        System.out.println("Sumar int: " + sumar(10, 5));
        System.out.println("Sumar float: " + sumar(10.0F, 5F));
        System.out.println("Sumar float-int: " + sumar(10F, 5));
        System.out.println("Sumar int-float: " + sumar(10, 5.0F));
        System.out.println("Sumar double: " + sumar(10.0, 5.0));
        System.out.println("Sumar string: " + sumar("10", "5"));

        System.out.println("Sumar long: " + sumar(10L, 5L));
        System.out.println("Sumar int: " + sumar(10, '@') );
        System.out.println("SUmar float-int:" + sumar(10F, '@') );

        System.out.println("Sumar argumentos sin definir integer: " + sumar(1, 2, 3, 4, 5, 6, 7));
        System.out.println("Sumar argumentos sin definir doubles: " + sumar(1.1, 2.2, 3.3, 4.4, 5.5));

    }

}
