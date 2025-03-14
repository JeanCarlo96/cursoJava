package main.java.impresiones;

public class Main {

    public static void main(String[] args) {

        Ficha ficha1 = new Ficha("azul", 235, (Ficha [])null);
        Ficha ficha2 = new Ficha("rojo", 18, ficha1);
        Ficha ficha3 = new Ficha("verde", 2318, ficha1, ficha2);

        ficha1.addFicha(ficha3);

        System.out.println(ficha1);
        System.out.println(ficha2);
        System.out.println(ficha3);

    }

}
