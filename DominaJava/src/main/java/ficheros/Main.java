package main.java.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //System.out.println("Directorio de trabajo actual: " + System.getProperty("user.dir"));

        try(
            Scanner s = new Scanner(new File("src/main/java/ficheros/entrada.txt"));
            FileWriter fw = new FileWriter("src/main/java/ficheros/salida.txt");
            ){
            List<Dato> leidos = LeerEntrada.leerDatos(s);
            System.out.println(leidos);
            for(Dato dato : leidos){
                System.out.println(dato);
                String linea = dato.getFecha() + ";"
                        + dato.getNombre() + ";"
                        + dato.getSueldo() + "\n";
                fw.write(linea);
            }
            System.out.println("Ya está, mira el fichero de salida...");
        }catch (IOException e){
            System.err.println("Fichero no Encontrado");
        }

    }

}
