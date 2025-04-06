package main.java.url;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ClienteEcho2 {

    private DatagramSocket datagramSocket;
    private InetAddress direccionDelServidor;
    private int puertoDelServidor;
    private byte[] buffer;

    public ClienteEcho2(InetAddress direccionDelServidor, int puertoDelServidor){
        this.direccionDelServidor = direccionDelServidor;
        this.puertoDelServidor = puertoDelServidor;
        try{
            datagramSocket = new DatagramSocket();
        } catch (SocketException e){
            e.printStackTrace();
        }
    }

    public String enviarMensaje(String mensaje){
        buffer = mensaje.getBytes();
        DatagramPacket paquete = new DatagramPacket(buffer, buffer.length, direccionDelServidor, puertoDelServidor);

        try {
            datagramSocket.send(paquete);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        DatagramPacket paqueteEcho = new DatagramPacket(buffer, buffer.length);
        try {
            datagramSocket.receive(paqueteEcho);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String mensajeRecibido = new String(paqueteEcho.getData(), 0, paqueteEcho.getLength());
        return mensajeRecibido;
    }

}
