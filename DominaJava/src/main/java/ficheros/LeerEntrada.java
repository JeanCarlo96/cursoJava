package main.java.ficheros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeerEntrada {


    private static final String PATRON = "dd/MM/yyyy";
    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern(PATRON);

    public static List<Dato> leerDatos(Scanner s){
        List<Dato> leidos = new ArrayList<>();
        while(s.hasNextLine()){
            String linea = s.nextLine();
            String[] datos = linea.split("\\s+");
            String nombre = datos[0];
            LocalDate fecha = LocalDate.parse(datos[1], DTF);
            int sueldo = Integer.parseInt(datos[2]);

            Dato dato = new Dato(nombre, fecha, sueldo);
            leidos.add(dato);
        }
        return leidos;
    }

}
