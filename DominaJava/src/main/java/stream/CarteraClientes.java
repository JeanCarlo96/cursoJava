package main.java.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CarteraClientes {

    public static void main(String[] args) {

        ArrayList<Cliente> clientes = crearListaDeClientes();

        // Forma Clásica
        for (Cliente cliente : clientes){
            if(cliente.getNombre().startsWith("M")){
                System.out.println(cliente.toString());
            }
        }

        // Con Stream
        Long mexicanosM = clientes.stream()
                .filter(cliente -> cliente.getNombre().startsWith("M"))
                .peek(cliente -> System.out.println("Cliente que empiece por M: " + cliente))
                .filter(cliente -> cliente.getPais().equalsIgnoreCase("MEXICO"))
                .peek(cliente -> System.out.println("Cliente que empieza por M y es de México: " + cliente))
                .count();

        Stream.of("MARÍA", "PEDRO", "JUAN", "PEDRO")
                .distinct()
                .sorted()
                .map(String::toLowerCase)
                .forEach(System.out::println);

    }

    private static ArrayList<Cliente> crearListaDeClientes() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("GREGORIO", "HINOJOSA", "MEXICO"));
        clientes.add(new Cliente("LORENA", "DE LUCAS", "COLOMBIA"));
        clientes.add(new Cliente("LAURA", "GARANTE", "ESPAÑA"));
        clientes.add(new Cliente("JUAN CARLOS", "MORATALLA", "ARGENTINA"));
        clientes.add(new Cliente("JOSE CARLOS", "CORALES", "PERÚ"));
        clientes.add(new Cliente("SEBASTIAN", "GALAN", "VENEZUELA"));
        clientes.add(new Cliente("JUANA", "MERA", "ARGENTINA"));
        clientes.add(new Cliente("MÓNICA", "MENDIZABAL", "MEXICO"));
        clientes.add(new Cliente("PEDRO", "GARCÍA", "ESPAÑA"));
        clientes.add(new Cliente("ALBA", "ESPEJO", "CHILE"));
        clientes.add(new Cliente("JAIME", "VIZUETE", "ECUADOR"));
        clientes.add(new Cliente("MARÍA MAR", "CHECA", "GUATEMALA"));

        return clientes;
    }

}
