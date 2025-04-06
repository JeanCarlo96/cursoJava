package main.java.excepcion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ListaDeLaCompra {

    private ArrayList<String> lista;
    private String archivo;

    public ListaDeLaCompra(String filename) throws IOException {
        archivo = filename;
        cargarLista(archivo);

    }

    private void cargarLista(String filename) throws IOException {

        lista = new ArrayList<>(Files.readAllLines(Paths.get(filename)));

    }

    public String obtenerElemento(int indice) throws PositionException{
        try {
            return lista.get(indice -1);
        }catch (IndexOutOfBoundsException e){
           PositionException positionException = new PositionException("Posición fuera de los límites de la lista");
           positionException.initCause(e);
           throw positionException;
        }

    }

    public void insertarElemento(String elemento) throws IOException{
        FileWriter fstream = new FileWriter(archivo, true);
        try(BufferedWriter out = new BufferedWriter(fstream)){
            out.write("\n" + elemento);
            cargarLista(archivo);
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }

    }
}
