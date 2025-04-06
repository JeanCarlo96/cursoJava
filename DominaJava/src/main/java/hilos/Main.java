package main.java.hilos;

public class Main {

    public static void main(String[] args) {

        Thread miHilo = new Thread(new SaludadorRunnable(2000), "Hilo0");
        miHilo.start();

        Thread miHilo1 = new Thread(new SaludadorRunnable(2000), "Hilo1");
        miHilo1.start();

        /* Interrumpir un hilo
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        miHilo1.interrupt();
         */
        while(miHilo.isAlive() || miHilo1.isAlive()){

        }

        // Libreamos recursos

    }

}
