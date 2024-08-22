package Practica.SupermercadoPOO.Clases;
import java.util.ArrayList;

public class Factura {
    private Caja caja;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private double total;
    
    public Factura(Caja caja, Cliente cliente, double total, ArrayList<Producto> productosComprados) {
        this.cliente = cliente;
        this.caja = caja;
        this.productos = productosComprados;
        this.total = total;
    }

    public String getCaja() {
        return caja.getInfoCaja();
    }

    public String getCliente() {
        return cliente.toString();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public double getTotal() {
        return total;
    }
}
