package main.java.ordenar;

import java.time.LocalDate;
import java.util.Objects;

public class Persona implements Comparable<Persona>{

    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public int compareTo(Persona p) {
        if(p == null){
            return 1;
        }

        int compAp = apellido.compareTo(p.apellido);
        if(compAp != 0){
            return compAp;
        }

        int compNom = nombre.compareTo(p.nombre);
        if(compNom != 0){
            return compNom;
        }

        int compEdad = fechaNacimiento.compareTo(p.fechaNacimiento);
        return -compEdad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido) && Objects.equals(fechaNacimiento, persona.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, fechaNacimiento);
    }
}
