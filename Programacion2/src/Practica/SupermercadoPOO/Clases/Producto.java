package Practica.SupermercadoPOO.Clases;

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
        return "Producto: " + nombre + ", Precio: $" + String.format("%.2f", precio) + ", Cantidad: " + cantidad + " unidades";
    }
}
