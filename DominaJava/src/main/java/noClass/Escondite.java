package main.java.noClass;

public class Escondite {

    public static void main(String[] args) {

        try{
            Fallida f1 = new Fallida();
        } catch (Throwable t){
            System.out.println("Primera llamada: " + t
            + " causasda por " + t.getCause() + "\n");
        }

        try {
            Fallida f2 = new Fallida();
        } catch (Throwable t){
            System.out.println("Primera llamada: " + t
                    + " causasda por " + t.getCause() + "\n");
        }

        try {
            Class.forName("Fallida");
        } catch(ClassNotFoundException e){
            System.out.println("Class for name (Fallida sin paquete): "
                    + e + " causasda por " + e.getCause() + "\n");
        }

        try {
            Class.forName("main.java.noClass.Fallida");
        } catch(ClassNotFoundException e){
            System.out.println("Class for name: "
                    + e + " causasda por " + e.getCause() + "\n");
        } catch (Throwable t){
            System.out.println("Class for name (Fallida con paquete): "
                    + t + " causasda por " + t.getCause() + "\n");
        }

        try{
            Class.forName("main.java.hashEquals.Movil");
            System.out.println("Class for name (Movil con paquete) funciona");
        }catch(ClassNotFoundException e){
            System.out.println("Class for name: "
                    + e + " causasda por " + e.getCause() + "\n");
        } catch (Throwable t){
            System.out.println("Class for name (Movil con paquete): "
                    + t + " causasda por " + t.getCause() + "\n");
        }

    }

}
