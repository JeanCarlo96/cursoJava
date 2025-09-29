package com.jcma.repaso.poo;

public class EjemploAutomovilRelacionesObjetos {

    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Luci", "Martínez");
        Persona conductorNissan = new Persona("Pato", "ROdriguez");

        Automovil subaru = new Automovil("Subaru", "Impresa", Color.AMARILLO, new Motor(2.0, TipoMotor.DIESEL), new Tanque());

        Rueda[] ruedaSub = new Rueda[5];
        for (int i = 0; i < ruedaSub.length; i++) {
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        Automovil nissan = new Automovil("Nissan", "Navara", Color.ROJO, new Motor(3.5, TipoMotor.GASOLINA), new Tanque(50));

        nissan.addRueda(new Rueda("Michelin", 17, 10.5))
                .addRueda(new Rueda("Michelin", 17, 10.5))
                .addRueda(new Rueda("Michelin", 17, 10.5))
                .addRueda(new Rueda("Michelin", 17, 10.5))
                .addRueda(new Rueda("Michelin", 17, 10.5));

        subaru.setConductor(conductorSubaru);
        nissan.setConductor(conductorNissan);

        subaru.setTipo(TipoAutomovil.COUPE);
        nissan.setTipo(TipoAutomovil.CONVERTIBLE);

        Automovil.setColorPatente("Verde");

        System.out.println(subaru.detalle());
        System.out.println(nissan.detalle());

        System.out.println("Conductor subaru: " + subaru.getConductor());

        for (Rueda r : subaru.getRuedas()) {
            System.out.println(r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho());
        }

    }

}
