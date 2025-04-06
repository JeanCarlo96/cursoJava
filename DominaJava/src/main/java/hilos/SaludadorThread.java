package main.java.hilos;

public class SaludadorThread extends Thread{

    @Override
    public void run(){
        System.out.println("Hola me llamo " + getName());
    }

}
