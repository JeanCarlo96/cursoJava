package main.java.json;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ciclista {

    private String nombre;
    private List<Bicicleta> bicicletas;
    private LocalDate fechaNacimiento;

    public Ciclista(String nombre, LocalDate fechaNacimiento){
        this.nombre = nombre;
        bicicletas = new ArrayList<>();
        this.fechaNacimiento = fechaNacimiento;
    }

    public void anadirBicicletas(Bicicleta bicicleta){
        bicicletas.add(bicicleta);
    }

    @Override
    public String toString() {
        return "Ciclista{" +
                "nombre='" + nombre + '\'' +
                "fecha nacimiento='" + fechaNacimiento + '\'' +
                ", bicicletas=" + bicicletas +
                '}';
    }
}
