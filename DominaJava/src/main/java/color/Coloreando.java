package main.java.color;

public class Coloreando {

    private static final Formato ROJO = new Formato(Color.ROJO, Decorado.NORMAL, Enfasis.NORMAL);
    private static final Formato VERDE_NEGRITA = new Formato(Color.VERDE, Decorado.NEGRITA, Enfasis.BRILLANTE);

    public static void main(String[] args) {
        
        System.out.println("Coloreando....");
        System.out.println(ROJO + "en rojo" + Formato.RESET);
        System.out.println(VERDE_NEGRITA + "en verde negrita" + Formato.RESET);

    }
    
}
