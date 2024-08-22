package Practica.SupermercadoPOO.Clases;
import java.util.ArrayList;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    public String getNombre() {
            return nombre;
        }
    public int getCantidad() {
        return cantidad;
    }
    public String toString() {
        return "Producto: " + nombre + ", Precio: $" + String.format("%.2f", precio) + ", Unidades disponibles: " + cantidad;
    }

    public  ArrayList<Producto> getProductos(){
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("CocaCola", 1800, 100));
        productos.add(new Producto("Sprite", 1500, 50));
        productos.add(new Producto("Alfajor Tatin", 600, 50));
        productos.add(new Producto("Caramelos Masticables", 20.50, 200));
        return productos;
    }
}
