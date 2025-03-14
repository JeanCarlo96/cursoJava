package main.java.nullPointer;

public class MasNulos {

    public static String fichaCarro(Carro carro){
        return "Propietario: " + carro.getTitular().getNombre() + " - " + carro.getMarca() + " - " + carro.getModelo();
    }

}
