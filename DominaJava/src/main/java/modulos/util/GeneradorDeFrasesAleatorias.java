package main.java.modulos.util;

import main.java.modulos.estructura.Frase;

import java.util.Random;

public class GeneradorDeFrasesAleatorias {

    private static final Frase[] frases = {
            new Frase("No hay que ir para atrás ni para darse impulso", "Lao Tsé"),
            new Frase("No hay caminos para la paz; la paz es el camino", "Mahatma Gandhi"),
            new Frase("Aprende a vivir y sabrás morir bien", "Confusio"),
            new Frase("Cada día sabemos más y entendemos menos", "Albert Einstein"),
            new Frase("El dinero no puede comprar la vida","Bob Marley" )
    };

    public static Frase obtenerFraseAleatoria(){
        Random random = new Random();
        int n = random.nextInt(frases.length);
        return frases[n];
    }

}
