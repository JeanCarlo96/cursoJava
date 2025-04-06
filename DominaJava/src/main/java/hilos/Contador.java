package main.java.hilos;

public class Contador {

    private int c =0;

    public void incrementar(){
        c++;
        for(int i = 0; i < 20; i++){
            System.out.println("Esperamos un segundo desde el hilo " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void decrementar(){
        c--;
        for(int i = 0; i < 5; i++){
            System.out.println("Esperamos un segundo desde el hilo " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int obtenerValor(){
        return c;
    }

}
