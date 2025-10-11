package com.jcma.pack.jardin;

import com.jcma.pack.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }

}
