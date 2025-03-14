package main.java.expresionRegular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionRegular {

    public static void encaja(String patron, String texto){
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(texto);
        boolean encuentra = matcher.find();
        boolean encaja = matcher.matches();

        System.out.println("Patrón: " + patron + " - Texto: " + texto);
        System.out.println("Encuentra? " + (encuentra? "Si" : "No"));
        System.out.println("Encaja? " + (encaja? "Si" : "No"));
        System.out.println();
    }

}
