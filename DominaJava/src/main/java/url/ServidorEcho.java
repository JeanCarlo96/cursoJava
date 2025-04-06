package main.java.url;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorEcho {

    private int numeroDePuerto;
    private Socket clienteSocker;
    private ServerSocket servidorSocket;
    private PrintWriter out;
    private BufferedReader in;

    public ServidorEcho(int numeroDePuerto){
        this.numeroDePuerto = numeroDePuerto;
    }

    public void comenzar(){
        try {
            servidorSocket = new ServerSocket(numeroDePuerto);
            clienteSocker = servidorSocket.accept();
            out = new PrintWriter(clienteSocker.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clienteSocker.getInputStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null){
                out.println(inputLine);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void parar(){
        try{
            in.close();
            out.close();
            servidorSocket.close();
            clienteSocker.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        ServidorEcho servidorEcho = new ServidorEcho(5000);
        servidorEcho.comenzar();

    }

}
