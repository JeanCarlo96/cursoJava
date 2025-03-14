package main.java.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDate.class,
                        new LocalDateAdapter())
                .create();

        Bicicleta bici1 = new Bicicleta("ABK", "Verona", 26, 1, true);
        System.out.println("bici1: " + bici1);

        String jsonBici1 = gson.toJson(bici1);
        System.out.println("JSON: " + jsonBici1);

        Ciclista miguel = new Ciclista("Miguel", LocalDate.now());
        miguel.anadirBicicletas(bici1);
        Bicicleta bici2 = new Bicicleta("ABK", "Grand Fondo", 12, 1, true);
        miguel.anadirBicicletas(bici2);
        System.out.println("Ciclista: " + miguel);

        String jsonCiclista = gson.toJson(miguel);
        System.out.println(jsonCiclista);

        Ciclista reconstruido = gson.fromJson(jsonCiclista, Ciclista.class);
        System.out.println("Reconstruido: " + reconstruido);

    }

}
