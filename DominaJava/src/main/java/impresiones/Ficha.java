package main.java.impresiones;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashSet;

public class Ficha {

    private String nombre;
    private Integer num;
    private Collection<Ficha> coleccion;
    private LocalDateTime fecha;

    public Ficha(String nombre, Integer num, Ficha... elems){
        this.nombre = nombre;
        this.num = num;
        coleccion = new HashSet<>();
        if(elems != null){
            for(Ficha elem : elems){
                coleccion.add(elem);
            }
        }
        fecha = LocalDateTime.now();
    }

    public void addFicha(Ficha ficha){
        coleccion.add(ficha);
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "nombre='" + nombre + '\'' +
                ", num=" + num +
                ", coleccion=" + coleccion +
                ", fecha=" + fecha +
                '}';
    }
}
