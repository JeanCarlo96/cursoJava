package main.java.ficheros;

import java.time.LocalDate;

public class Dato {

    private String nombre;
    private LocalDate fecha;
    private Integer sueldo;

    public Dato(String nombre, LocalDate fecha, Integer sueldo){
        this.nombre = nombre;
        this.fecha = fecha;
        this.sueldo = sueldo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public LocalDate getFecha(){
        return this.fecha;
    }

    public Integer getSueldo(){
        return this.sueldo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setFecha(LocalDate fecha){
        this.fecha = fecha;
    }

    public void setSueldo(Integer sueldo){
        this.sueldo = sueldo;
    }

    @Override
    public String toString(){
        return  this.nombre + " - " + this.fecha + " - " + this.sueldo;
    }

}
