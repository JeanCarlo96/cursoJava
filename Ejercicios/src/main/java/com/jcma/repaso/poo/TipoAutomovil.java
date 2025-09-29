package com.jcma.repaso.poo;

public enum TipoAutomovil {

    SEDAN("Sedan", "Auto Normal", 4),
    STATION_WAGON("Station Wagon", "Auto Grande", 5),
    HATCHBACK("Hatchback", "Auto Compacto", 4),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Cupé", "Auto Pequeño", 2),
    CONVERTIBLE("Convertible", "Auto Deportivo", 2),
    FURGON("Furgón", "Auto Utilitario", 4),
    SUV("Todoterreno", "Auto Todoterreno Deportivo", 5);

    private final String nombre;
    private final int numeroPuerta;
    private final String descripcion;

    TipoAutomovil(String nombre, String descripcion, int numeroPuerta) {
        this.nombre = nombre;
        this.numeroPuerta = numeroPuerta;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
