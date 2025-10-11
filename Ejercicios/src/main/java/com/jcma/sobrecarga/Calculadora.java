package com.jcma.sobrecarga;

public class Calculadora {

    private Calculadora(){

    }

    public static int sumar(int a, int b){
        return a + b;
    }

    public static float sumar(float x, float y){
        return x + y;
    }

    public static float sumar(int i, float j){
        return i + j;
    }

    public static float sumar(float i, int j){
        return i + j;
    }

    public static double sumar(double a, double b){
        return a + b;
    }

    public static int sumar(String a, String b){
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    public static int sumar(int a, int b, int c){
        return a + b + c;
    }

    public static int sumar(int... argumentos){
        int total = 0;
        for(int i : argumentos){
            total += i;
        }
        return total;
    }

    public static double sumar(double... varargs){
        double total = 0.0;
        for(double d: varargs){
            total += d;
        }
        return total;
    }

}
