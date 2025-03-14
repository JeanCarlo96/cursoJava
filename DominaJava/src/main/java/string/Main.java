package main.java.string;

public class Main {

    public static void main(String[] args) {

        String conGuiones = "1234-BCD-xyz-3c4d5e";
        String[] trozosGuiones = conGuiones.split("-");
        for (String trozo : trozosGuiones){
            System.out.println(trozo);
        }
        System.out.println();

        String csv = "Marta,Fernandez,Sevilla,Segovia";
        String[] datos = csv.split(",");
        System.out.println("Nombre: " + datos[0]);
        System.out.println("Nombre: " + datos[1]);
        System.out.println("Nombre: " + datos[2]);
        System.out.println("Nombre: " + datos[3]);
        System.out.println();

    }

}
