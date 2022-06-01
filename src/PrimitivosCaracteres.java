public class PrimitivosCaracteres {

    public static void main(String[] args) {

        char caracter = 'A';
        System.out.println("caracter = " + caracter);

        caracter = '0';
        System.out.println("caracter = " + caracter);

        caracter = 64;
        System.out.println("caracter = " + caracter);

        caracter = '\u0040';
        System.out.println("caracter = " + caracter);

        System.out.println("char corresponde en byte: " + Character.BYTES);
        System.out.println("char corresponde en bites: " + Character.SIZE);
        System.out.println("char mínimo valor: " + Character.MIN_VALUE);
        System.out.println("char máximo valor: " + Character.MAX_VALUE);

        // Wrapper
        Character a = '@';
        System.out.println(a);
        
        // Caracteres Especiales
        char espacio = ' ';
        System.out.println("especial = " + espacio);

        espacio = '\u0020';
        System.out.println("especial = " + espacio);

        char retroceso = '\b';
        System.out.println("especial = -" + retroceso + retroceso + retroceso);

        char tabulador = '\t';
        System.out.println("tabulador = " + tabulador + "Hola");
        System.out.println("Mensaje");
        System.out.println("Mensaje");

        char nuevaLinea = '\n';
        System.out.println("nuevaLinea = " + nuevaLinea);
        System.out.println("Otra Línea");

        char retornoCarro = '\r';
        System.out.println("retornoCarro = " + retornoCarro + "XD");


    }

}
