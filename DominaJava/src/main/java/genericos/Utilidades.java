package main.java.genericos;

public class Utilidades {

    public static <T> int contarTodasLasApariciones(T[] lista, T objeto){
        int contador = 0;

        for (T objetoLista :
                lista) {
            if(objeto.equals(objetoLista)){
                contador++;
            }
        }
        T mivariable;

        return contador;
    }

    public void otroMetodo(){
        //T miVariable;
    }

}
