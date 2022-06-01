public class PrimitivosFloat {

    static float variableFloat;

    public static void main(String[] args) {

        float realFloat = 2.12e3f; //2120f
        System.out.println("realFloat = " + realFloat);
        
        realFloat = 1.5e-10f;
        System.out.println("realFloat = " + realFloat);

        realFloat = 1;
        System.out.println("realFloat = " + realFloat);

        // Error
        //realFloat = 1.0;
        //System.out.println("realFloat = " + realFloat);
        
        // Forma Correcta
        realFloat = 1.0f;
        System.out.println("realFloat = " + realFloat);

        // Valores del Float
        System.out.println("float corresponde en byte a : " + Float.BYTES);
        System.out.println("float corresponde en bites a : " + Float.SIZE);
        System.out.println("Máximo valor del float: " + Float.MAX_VALUE);
        System.out.println("Mínimo valor del float: " + Float.MIN_VALUE);
        
        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);

        // Valores del Double
        System.out.println("double corresponde en byte a : " + Double.BYTES);
        System.out.println("double corresponde en bites a : " + Double.SIZE);
        System.out.println("Máximo valor del double: " + Double.MAX_VALUE);
        System.out.println("Mínimo valor del double: " + Double.MIN_VALUE);

        System.out.println("Variable Float: " + variableFloat);

    }

    public void hola(){
        variableFloat = 10.0f;
    }

}
