package main.java.genericos;

public class CajaGenerica<T> {

    private T objeto;

    public void set(T objeto){
        this.objeto = objeto;
    }

    public T get(){
        return this.objeto;
    }

}
