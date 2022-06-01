public class PrimitivosEnteros {

    public static void main(String[] args) {

        byte numeroByte = 7;
        System.out.println("numerByte: " + numeroByte);
        System.out.println("tipo byte corresponde en byte a : " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bits a : " + Byte.SIZE);
        System.out.println("valor máximo del byte : " + Byte.MAX_VALUE);
        System.out.println("valor minimo del byte : " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numerShort: " + numeroShort);
        System.out.println("tipo Short corresponde en byte a : " + Short.BYTES);
        System.out.println("tipo Short corresponde en bits a : " + Short.SIZE);
        System.out.println("valor máximo del Short : " + Short.MAX_VALUE);
        System.out.println("valor minimo del Short : " + Short.MIN_VALUE);

        int numetoInt = 2147483647;
        System.out.println("numeroInt: " + numetoInt);
        System.out.println("tipo Short corresponde en int a : " + Integer.BYTES);
        System.out.println("tipo Short corresponde en bits a : " + Integer.SIZE);
        System.out.println("valor máximo del int : " + Integer.MAX_VALUE);
        System.out.println("valor minimo del int : " + Integer.MIN_VALUE);

        long numeroLong = 2147483648L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo Long corresponde en int a : " + Long.BYTES);
        System.out.println("tipo Long corresponde en bits a : " + Long.SIZE);
        System.out.println("valor máximo del Long : " + Long.MAX_VALUE);
        System.out.println("valor minimo del Long : " + Long.MIN_VALUE);

    }

}
