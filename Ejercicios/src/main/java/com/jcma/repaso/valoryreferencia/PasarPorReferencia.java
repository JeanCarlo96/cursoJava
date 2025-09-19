package com.jcma.repaso.valoryreferencia;

public class PasarPorReferencia {

    public static void main(String[] args) {

        int[] edad = {10, 11, 12};

        System.out.println("Iniciamos el método main");
        for (int i : edad) {
            System.out.println("edad[i] = " + i);
        }
        System.out.println("Antes de invocar el método test");
        test(edad);
        System.out.println("Después de invocar el método test");
        for (int i : edad) {
            System.out.println("edad[i] = " + i);
        }
        System.out.println("Finaliza el método main");

    }

    public static void test(int[] edadArr){

        System.out.println("Iniciamos el método test ");
        for (int i = 0; i < edadArr.length; i++) {
            edadArr[i] += 20;
        }
        System.out.println("Finaliza el método test");

    }

}
