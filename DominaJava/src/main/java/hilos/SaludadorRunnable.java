package main.java.hilos;

public class SaludadorRunnable implements Runnable{

    private int periodoSaludo;

    public SaludadorRunnable(int periodoSaludo){
        this.periodoSaludo = periodoSaludo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(periodoSaludo);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Hilo: " + Thread.currentThread().getName() + " termina su ejecución.");
                return;
            }
            System.out.println("Hola me llamo " + Thread.currentThread().getName());
        }
    }
}
