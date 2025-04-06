package main.java.hilos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main5 {

    public static void main(String[] args) {

        Thread hilo1 = new Thread(new SaludoRunnable(), "Hilo 1");
        hilo1.start();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new SaludoRunnable());
        executorService.submit(new SaludoRunnable());
        executorService.submit(new SaludoRunnable());

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Esta es otra tarea");
            }
        });

        executorService.shutdown();
        //executorService.shutdownNow();

    }

}
