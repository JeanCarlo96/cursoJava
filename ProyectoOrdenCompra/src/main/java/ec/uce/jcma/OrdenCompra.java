package ec.uce.jcma;

import java.util.Date;

public class OrdenCompra {

    private int identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int idProducto;

    public OrdenCompra(String descripcion) {
        this.productos = new Producto[10];
        this.descripcion = descripcion;
        this.identificador++;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto producto){
        productos[idProducto++] = producto;
    }

    public Integer granTotal(){
        int sum = 0;
        for (int i = 0; i < idProducto; i++){
            sum += productos[i].getPrecio();
        }
        return sum;
    }

}
