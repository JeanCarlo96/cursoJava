package main.java.url;

public class Main2 {

    public static void main(String[] args) {

        ClienteEcho clienteEcho = new ClienteEcho("127.0.0.1", 5000);
        clienteEcho.comenzarConexion();
        String respuesta = clienteEcho.enviarMensaje("Hola");
        System.out.println("Respuesta: " + respuesta);

        String respuesta2 = clienteEcho.enviarMensaje("Qué tal?");
        System.out.println("Respuesta 2: " + respuesta2);

        String respuesta3 = clienteEcho.enviarMensaje("Me llamo María");
        System.out.println("Respuesta 3: " + respuesta3);

        clienteEcho.pararConexion();

    }

}
