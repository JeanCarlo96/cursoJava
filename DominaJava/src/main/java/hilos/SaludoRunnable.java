package main.java.hilos;

public class SaludoRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hola me llamo " + Thread.currentThread().getName());
    }
}
