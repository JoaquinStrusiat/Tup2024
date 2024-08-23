package Practica.SupermercadoPOO.Clases;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = 0;
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
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getProducto(){
        double total = precio * cantidad;
        return nombre + " - $" + String.format("%.2f", precio) + " - [" + cantidad + " unidades = $" + String.format("%.2f", total) + "]";
    } 

    public String toString() {
        return nombre + " - $" + String.format("%.2f", precio);
    }
}
