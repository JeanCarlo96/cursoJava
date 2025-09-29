package com.jcma.repaso.poo;

public class EjemploAutomovil {

    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impresa", Color.AMARILLO, new Motor(2.0, TipoMotor.DIESEL));

        System.out.println(subaru.detalle());
        System.out.println(subaru.acelerar(2600));
        System.out.println(subaru.frenar());

        System.out.println(subaru.acelerarFrenar(3000));

        Automovil nissan = new Automovil("Nissan", "Navara", Color.AZUL, new Motor(3.0, TipoMotor.GASOLINA), new Tanque());
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.ROJO, new Motor(3.0, TipoMotor.GASOLINA), new Tanque());
        Automovil nissan3 = new Automovil();
        System.out.println("Son iguales: " + (nissan == nissan2));
        System.out.println("Son iguales: " + (nissan.equals(nissan2)));
        System.out.println("Objeto con null: " + nissan3.equals(nissan2));

        System.out.println("Kilometro por litro: " + nissan.calcularConsumo(300, 0.6f));
        System.out.println("Kilometro por litro: " + nissan.calcularConsumo(300, 60));

        System.out.println(nissan);

    }

}
