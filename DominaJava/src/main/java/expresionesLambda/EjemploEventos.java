package main.java.expresionesLambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploEventos {

    public static void main(String[] args) {

        JButton show = new JButton("Mostrar");
        /*
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Mostrando...");
            }
        */
        show.addActionListener(e -> System.out.println("Mostrando..."));
    }

}
