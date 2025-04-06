package main.java.expresionesLambda;

@FunctionalInterface
public interface OperadorBinarioG<T> {

    T aplicar(T op1, T op2);

    //double obtenerValor();

}
