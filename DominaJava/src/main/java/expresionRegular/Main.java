package main.java.expresionRegular;

public class Main {

    public static void main(String[] args) {

        ExpresionRegular.encaja("a", "hola");
        ExpresionRegular.encaja("h.+a", "hola");
        ExpresionRegular.encaja("h.+a", "ho");
        ExpresionRegular.encaja("h.*a", "ha");
        ExpresionRegular.encaja("a*", "zoo");
        ExpresionRegular.encaja("a+", "zoo");
        ExpresionRegular.encaja("\\d{5}", "1234");
        ExpresionRegular.encaja("\\d{5}", "12345");
        ExpresionRegular.encaja("\\d{5}", "123456");
        ExpresionRegular.encaja("\\d{5}", "12345z");



    }

}
