package com.jcma.repaso.poo;

public enum Color {

    ROJO("rojo"),
    AMARILLO("amarillo"),
    AZUL("azul"),
    ANARANJADO("anaranjado");

    private final String color;

    Color(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
