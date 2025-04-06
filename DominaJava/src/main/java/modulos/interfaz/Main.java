package main.java.modulos.interfaz;

import main.java.modulos.estructura.Frase;
import main.java.modulos.frases.GestorFraseDelDia;

public class Main {

    public static void main(String[] args) {

        GestorFraseDelDia gestorFraseDelDia = new GestorFraseDelDia();
        Frase fraseDelDia = gestorFraseDelDia.obtenerFraseDelDia();
        System.out.println("Frase del día: " + fraseDelDia.getFrase() + " por: " + fraseDelDia.getAutor());

    }

}
