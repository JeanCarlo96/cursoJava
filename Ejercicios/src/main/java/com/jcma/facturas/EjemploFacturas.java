package com.jcma.facturas;

import com.jcma.facturas.modelo.Cliente;
import com.jcma.facturas.modelo.Factura;
import com.jcma.facturas.modelo.ItemFactura;
import com.jcma.facturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFacturas {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setCi("1003909437");
        cliente.setNombre("Jean Carlo");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una descripción de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;

        System.out.println();

        for (int i = 0; i < 3; i++) {
            producto = new Producto();
            System.out.print("Ingrese Producto N. " + producto.getCodigo() + ": ");
            producto.setNombre(s.next());

            System.out.print("Ingrese precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese cantidad: ");

            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
        }
        System.out.println(factura.generarDetalle());
    }

}
