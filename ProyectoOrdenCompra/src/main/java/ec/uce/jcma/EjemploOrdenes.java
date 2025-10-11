package ec.uce.jcma;

public class EjemploOrdenes {

    public static void main(String[] args) {

        OrdenCompra oc1 = new OrdenCompra("Orden Compra 1");
        OrdenCompra oc2 = new OrdenCompra("Orden Compra 2");
        OrdenCompra oc3 = new OrdenCompra("Orden Compra 3");

        Cliente c1 = new Cliente("Jean", "Marchesini");
        Cliente c2 = new Cliente("Pamela", "Carlosama");
        Cliente c3 = new Cliente("Dome", "Yaselga");

        oc1.setCliente(c1);
        oc2.setCliente(c2);
        oc3.setCliente(c3);

        Producto p1 = new Producto("Samsung", "S25 Ultra", 1200);
        Producto p2 = new Producto("Huawei", "Pura 50", 1000);
        Producto p3 = new Producto("Oppo", "Fine Ultra", 800);
        Producto p4 = new Producto("Apple", "17 Pro Max", 1300);

        oc1.addProducto(p1);
        oc1.addProducto(p2);
        oc1.addProducto(p3);
        oc1.addProducto(p4);

        Producto p5 = new Producto("Xiaomi", "Redmi Note 8 Pro", 300);
        Producto p6 = new Producto("Samsung", "S24 Plus", 800);
        Producto p7 = new Producto("Huawei", "Mate 50", 900);
        Producto p8 = new Producto("Oppo", "Fine Plus", 700);

        oc2.addProducto(p5);
        oc2.addProducto(p6);
        oc2.addProducto(p7);
        oc2.addProducto(p8);

        Producto p9 = new Producto("Apple", "16 Pro", 1050);
        Producto p10 = new Producto("Xiaomi", "Redmi Note 10 Pro", 350);
        Producto p11 = new Producto("Samsung", "S23 Normal", 700);
        Producto p12 = new Producto("Huawei", "Mate 40", 850);

        oc3.addProducto(p9);
        oc3.addProducto(p10);
        oc3.addProducto(p11);
        oc3.addProducto(p12);

        System.out.println("Orden 1 => Total: " + oc1.granTotal());
        for (Producto p : oc1.getProductos()) {
            if(p != null) {
                System.out.println(p);
            }
        }

        System.out.println("Orden 2 => Total: " + oc2.granTotal());
        for (Producto p : oc2.getProductos()) {
            if(p != null) {
                System.out.println(p);
            }
        }

        System.out.println("Orden 3 => Total: " + oc3.granTotal());
        for (Producto p : oc3.getProductos()) {
            if(p != null) {
                System.out.println(p);
            }
        }

    }

}
