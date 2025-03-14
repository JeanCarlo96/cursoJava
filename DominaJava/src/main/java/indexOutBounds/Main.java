package main.java.indexOutBounds;

public class Main {

    public static void main(String[] args) {

        int [] numeros = new int[]{1, 2, 3, 4};
        try {
            System.out.println(sumarHasta20(new int[]{5, 10, 1}));
            System.out.println("El cuarto número es: " + numeros[4]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ha fallado: " + e.getMessage());
        }

        String cadena = "Hola";
        try {
            System.out.println("La cuarta letra es: " + cadena.charAt(4));
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("");
        }

    }

    private static final int MAX = 20;
    private static int sumarHasta20(int[] nums){
        int i = 0;
        int sum = 0;
        while (sum < MAX && i < nums.length){
            sum += nums[i];
            i++;
        }
        return sum;
    }

}
