package Practica.SupermercadoPOO.Clases;
import java.util.ArrayList;

public class Factura {
    private Caja caja;
    private Cliente cliente;
    private ArrayList<Producto> carrito;
    
    public Factura(Caja caja, Cliente cliente, ArrayList<Producto> carrito) {
        this.cliente = cliente;
        this.caja = caja;
        this.carrito = carrito;
    }
    public String getTotal(){
        //Calculo el total de la compra
        double total = 0;
        for(Producto producto : carrito){
            total = total + (producto.getCantidad() * producto.getPrecio());
        }
        if (cliente.isMayorista() == true){
            return "$" + total + "\nDescuento mayorista del 20%: $" + total*0.8;
        } else {
            return "$" + total;
        } 
    }
    public String getProductos(){
        String productos = "";
        for(Producto producto : carrito){
            productos += producto.getProducto() + "\n";
        }
        return productos;
    }

    public String getFactura(){
        String factura = 
        "\n------------Factura de Compra------------" + 
        "\nInformacion de la caja:\n" + 
        caja.getInfoCaja() + 
        "\n\nInformacion del cliente:\n" + 
        cliente.toString() + 
        "\n--------------------------------------------------\n" + 
        "Productos: " + 
        getProductos() + 
        "--------------------------------------------------\n" + 
        "Total a pagar: " + getTotal();
        return factura;
    }
}
