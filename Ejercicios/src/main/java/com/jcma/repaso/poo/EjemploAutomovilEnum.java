package com.jcma.repaso.poo;

public class EjemploAutomovilEnum {

    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impresa", Color.AMARILLO, new Motor(2.0, TipoMotor.DIESEL));
        Automovil nissan = new Automovil("Nissan", "Navara", Color.ROJO, new Motor(2.0, TipoMotor.GASOLINA), new Tanque(50));

        subaru.setTipo(TipoAutomovil.COUPE);
        nissan.setTipo(TipoAutomovil.CONVERTIBLE);

        //TipoAutomovil tipo = subaru.getTipo();
        TipoAutomovil tipo = nissan.getTipo();

        switch (tipo){
            case CONVERTIBLE -> System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
            case HATCHBACK -> System.out.println("Es un automovil media compacto, aspecto deportivo");
            case SEDAN -> System.out.println("Es un automovil mediano");
            case PICKUP -> System.out.println("Es un automovil de doble cabina o camioneta");
            case STATION_WAGON -> System.out.println("Es un automovil más grande, con maleta grande");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();

        for(TipoAutomovil ta: tipos){
            System.out.println(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuerta());
            System.out.println();
        }

    }

}
