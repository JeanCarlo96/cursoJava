package main.java.mensajes;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Localizando {

    private static final ResourceBundle RECURSOS = ResourceBundle.getBundle("main.java.mensajes.vocabulario", Locale.UK);

    private static String construyeSujeto(String nombre, String adjetivo){
        return MessageFormat.format(RECURSOS.getString("sujeto"), nombre, adjetivo);
    }

    public static void main(String[] args) {

        System.out.println(construyeSujeto(
                RECURSOS.getString("manzana"),
                RECURSOS.getString("roja")
        ));

        System.out.println(construyeSujeto(
                RECURSOS.getString("manzana"),
                RECURSOS.getString("verde")
        ));

        System.out.println(construyeSujeto(
                RECURSOS.getString("pelota"),
                RECURSOS.getString("roja")
        ));

        System.out.println(construyeSujeto(
                RECURSOS.getString("pelota"),
                RECURSOS.getString("verde")
        ));

        System.out.println(
                MessageFormat.format(
                        RECURSOS.getString("frase"),
                        construyeSujeto(
                                RECURSOS.getString("pelota"),
                                RECURSOS.getString("roja")
                        )
                )
        );

    }

}
