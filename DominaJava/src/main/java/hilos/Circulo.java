package main.java.hilos;

import java.awt.Color;

public class Circulo {

    private final double radio;
    private final Color color;

    private Circulo(double radio, Color color){
        this.radio = radio;
        this.color = new Color(color.getRGB());
    }

    public static Circulo crear(double radio, Color color){
        return new Circulo(radio, color);
    }

    public double obtenerRadio() {
        return radio;
    }

    public Color obtenerColor() {
        return new Color(color.getRGB());
    }

    public double obtenerDiametro() {
        return radio * 2;
    }

    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public Circulo escalar(double factor) {
        return new Circulo(radio * factor, color);
    }

}
