package main.java.modulos.frases;

import main.java.modulos.estructura.Frase;
import main.java.modulos.util.GeneradorDeFrasesAleatorias;

public class GestorFraseDelDia {

    private Frase fraseDelDia;

    public Frase obtenerFraseDelDia() {
        if(fraseDelDia == null){
            fraseDelDia = GeneradorDeFrasesAleatorias.obtenerFraseAleatoria();
        }
        return fraseDelDia;
    }

}
