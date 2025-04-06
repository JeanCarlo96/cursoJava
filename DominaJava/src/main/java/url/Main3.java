package main.java.url;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main3 {

    public static void main(String[] args) {

        new ServidorEcho2(5000).start();
        ClienteEcho2 clienteEcho2 = null;

        try {
            clienteEcho2 = new ClienteEcho2(InetAddress.getLocalHost(), 5000);
            String respuesta = clienteEcho2.enviarMensaje("Hola, que tal?");
            System.out.println("La respuesta del servidor ha sido: " + respuesta);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

    }

}
