package com.jcma.repaso.poo;

public class EjemploAutomovilStatic {

    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impresa", Color.AMARILLO, new Motor(2.0, TipoMotor.DIESEL));
        Automovil nissan = new Automovil("Nissan", "Navara", Color.ROJO, new Motor(3.5, TipoMotor.GASOLINA), new Tanque(50));

        subaru.setTipo(TipoAutomovil.COUPE);
        nissan.setTipo(TipoAutomovil.CONVERTIBLE);

        Automovil.setColorPatente("Verde");

        System.out.println(subaru.detalle());
        System.out.println(nissan.detalle());

        System.out.println(Automovil.getColorPatente());

        System.out.println("Velocidad Maxima: " + Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("Velocidad Maxima Ciudad: " + Automovil.VELOCIDAD_MAXIMA_CIUDAD);

        System.out.println("Impresion de enum personalizado: " + subaru.getColor().getColor());

    }

}
