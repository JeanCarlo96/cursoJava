package main.java.redondeo;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        System.out.println("Bruto:\t\t" + Math.PI);

        System.out.println("Cuatro decimales: "
        + String.format("%.4f", Math.PI));

        System.out.println("Notación Científica: "
        + String.format("%e", Math.PI));

        System.out.println();

        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println("Decimal format:\t"
        + df.format(Math.PI));

        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println("DF DOWN:\t" + df.format(Math.PI));
        System.out.println("DF DOWN:\t" + df.format(-Math.PI));

        df.setRoundingMode(RoundingMode.FLOOR);
        System.out.println("DF FLOOR:\t" + df.format(Math.PI));
        System.out.println("DF FLOOR:\t" + df.format(-Math.PI));

        df.setRoundingMode(RoundingMode.UP);
        System.out.println("DF FLOOR:\t" + df.format(Math.PI));
        System.out.println("DF FLOOR:\t" + df.format(-Math.PI));

        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println("DF FLOOR:\t" + df.format(Math.PI));
        System.out.println("DF FLOOR:\t" + df.format(-Math.PI));

        System.out.println();

        System.out.println("DF #.##:\t" + df.format(1));
        DecimalFormat dfCeros = new DecimalFormat("0.00");
        System.out.println("DF 0.00:\t" + dfCeros.format(1));
        System.out.println("DF 0.00:\t" + dfCeros.format(Math.PI));
        DecimalFormat dfMiles = new DecimalFormat("#,###.00");
        System.out.println("DF #,###.00:\t" + dfMiles.format(Math.PI * 1000));
        dfMiles.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.FRANCE));
        System.out.println("DF # ###.00 FR:\t" + dfMiles.format(Math.PI * 1000));
        dfMiles.setDecimalFormatSymbols(new DecimalFormatSymbols(new Locale("es")));
        System.out.println("DF #,###.00 ES:\t" + dfMiles.format(Math.PI * 1000));

    }

}
