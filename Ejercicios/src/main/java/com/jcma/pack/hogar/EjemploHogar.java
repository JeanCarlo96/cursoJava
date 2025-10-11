package com.jcma.pack.hogar;

import com.jcma.pack.jardin.Perro;
import static com.jcma.pack.hogar.Persona.saludar;

public class EjemploHogar {

    public static void main(String[] args) {

        Persona p = new Persona();
        Perro perro = new Perro();
        // perro.jugar(); No permitido
        String saludo = saludar();

    }

}
