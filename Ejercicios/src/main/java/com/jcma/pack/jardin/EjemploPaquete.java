package com.jcma.pack.jardin;

import com.jcma.pack.hogar.*;
import static com.jcma.pack.hogar.Persona.saludar;
import static com.jcma.pack.hogar.Persona.GENERO_FEMENINO;
import static com.jcma.pack.hogar.Persona.GENERO_MASCULINO;
import static com.jcma.pack.hogar.ColorPelo.CAFE;

public class EjemploPaquete {

    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Jean");
        p.setApellido("Marchesini");
        p.setColorPelo(CAFE);
        System.out.println(p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "Tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println(jugando);
        String saludo = saludar();
        System.out.println(saludo);
        String generoMujer = GENERO_FEMENINO;
        String generoMasculino = GENERO_MASCULINO;
        System.out.println(generoMasculino);
        System.out.println(generoMujer);

    }

}
