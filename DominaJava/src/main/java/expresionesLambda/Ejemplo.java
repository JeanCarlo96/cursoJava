package main.java.expresionesLambda;

import java.util.function.UnaryOperator;

public class Ejemplo {

    private double miDouble = 5.0;
    private String miString = "Hola";

    public void miMetodo(){
        double miDoubleLocal = 7.0;
        String miStringLocal = "Buenos días";

        UnaryOperator<Double> operacion1 = n -> {
            miDouble++;
            return miDouble + n;
        };
        UnaryOperator<Double> operacion2 = n -> {
            // miDoubleLocal++; Las variables locales deben ser final
            String miString = "lambda String";
            System.out.println("Dentro de la expresión Lambda this.miString " + this.miString);
            return miDoubleLocal + n;
        };
        UnaryOperator<String> operacion3 = n -> miString + n;
        UnaryOperator<String> operacion4 = n -> miStringLocal + n;

        miDouble = 8.0;
        miString = "Adiós";

        operacion2.apply(2.0);
    }

}
