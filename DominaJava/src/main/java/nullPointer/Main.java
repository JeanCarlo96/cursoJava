package main.java.nullPointer;

public class Main {

    public static void main(String[] args) {

        Titular t1 = new Titular("Jean", "1003909437");
        Titular t2 = new Titular("Pamela", "Carlosama");

        Carro c1 = new Carro("Kia", "Sonet", 1.5, 2022, t1);
        Carro c2 = new Carro();
        c2.getTitular();

        System.out.println(MasNulos.fichaCarro(c1));
        System.out.println(MasNulos.fichaCarro(c2));

    }

}
