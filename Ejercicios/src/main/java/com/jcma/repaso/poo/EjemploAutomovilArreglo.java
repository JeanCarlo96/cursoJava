package com.jcma.repaso.poo;

import java.util.Arrays;

public class EjemploAutomovilArreglo {

    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Luci", "Martínez");
        Persona conductorNissan = new Persona("Pato", "Rodriguez");
        Persona conductorSuzuki = new Persona("Lalo", "García");

        Automovil subaru = new Automovil("Subaru", "Impresa", Color.AMARILLO, new Motor(2.0, TipoMotor.DIESEL), new Tanque());
        Automovil nissan = new Automovil("Nissan", "Navara", Color.ROJO, new Motor(3.5, TipoMotor.GASOLINA), new Tanque(50));
        Automovil suzuki = new Automovil("Suzuki", "Jinmy", Color.AZUL, new Motor(1.5, TipoMotor.GASOLINA), new Tanque(30));

        subaru.setConductor(conductorSubaru);
        nissan.setConductor(conductorNissan);
        suzuki.setConductor(conductorSuzuki);

        subaru.setTipo(TipoAutomovil.COUPE);
        nissan.setTipo(TipoAutomovil.CONVERTIBLE);
        suzuki.setTipo(TipoAutomovil.SUV);

        Automovil[] autos = new Automovil[3];
        autos[0] = subaru;
        autos[1] = nissan;
        autos[2] = suzuki;

        Arrays.sort(autos);
        for (Automovil auto : autos) {
            System.out.println(auto);
        }

    }

}
