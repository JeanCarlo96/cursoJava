package main.java.stream;

public class Cliente {

    private String nombre;
    private String primerApellido;
    private String pais;

    public Cliente(String nombre, String primerApellido, String pais) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
