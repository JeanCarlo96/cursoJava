package main.java.expresionesLambda;

public class EjemploRunnable {

    public static void main(String[] args) {

        // Código Clásico
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Corriendo...");
            }
        });

        thread1.start();

        // Código con expresión Lambda
        Thread thread2 = new Thread(() -> System.out.println("Corriendo Lambda.."));
        thread2.start();

    }

}
