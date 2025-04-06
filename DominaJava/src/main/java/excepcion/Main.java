package main.java.excepcion;

public class Main {

    public static void main(String[] args) throws PositionException {

        Interfaz interfaz = new Interfaz("src/main/java/excepcion/mi-lista.txt");
        interfaz.mostrarMenu();

    }

}
