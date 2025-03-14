package main.java.nullPointer;

public class Carro {

    private String marca;
    private String modelo;
    private Double cilindrada;
    private Integer anio;

    private Titular titular;

    public Carro(){

    }

    public Carro(String marca, String modelo, Double cilindrada, Integer anio, Titular titular){
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.anio = anio;
        this.titular = titular;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
}
