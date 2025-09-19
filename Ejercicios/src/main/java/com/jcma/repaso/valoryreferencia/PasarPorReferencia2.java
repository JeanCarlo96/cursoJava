package com.jcma.repaso.valoryreferencia;

class Persona {

    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

}

public class PasarPorReferencia2 {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Andres");

        System.out.println("Iniciamos el método main");
        System.out.println("persona: " + persona.getNombre());
        System.out.println("Antes de invocar el método test");
        test(persona);
        System.out.println("Después de invocar el método test");
        System.out.println("persona: " + persona.getNombre());
        System.out.println("Finaliza el método main");

    }

    public static void test(Persona persona){

        System.out.println("Iniciamos el método test ");
        persona.setNombre("Pepe");
        System.out.println("Finaliza el método test");

    }

}
