package main.java.hilos;

public class Main2 {

    public static void main(String[] args) {

        Contador contador = new Contador();
        Thread miHilo = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (contador){
                    contador.incrementar();
                    System.out.println("El valor del contador1 es " + contador.obtenerValor());
                }
            }
        }, "Hilo1");

        Thread miHilo2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (contador){
                    contador.decrementar();
                    System.out.println("El valor del contador2 es " + contador.obtenerValor());
                }
            }
        }, "Hilo2");

        miHilo.start();
        miHilo2.start();

    }

}
