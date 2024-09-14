package Practica.CalculadoraComida;
import java.util.ArrayList;

public class Ingrediente {
    private String nombre;
    private double cantidad;
    private double precio;

    private static ArrayList<Ingrediente> listaDeIngredientes = new ArrayList<>();

    public Ingrediente(String nombre, double cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public String toString() {
        return nombre + " - " + cantidad + " x uni/cc/g - $" + precio + "\n";
    }

    public static ArrayList<Ingrediente> getListaDeIngredientes() {
        return listaDeIngredientes;
    }

    
    public static void setListaDeIngredientes(Ingrediente ing) {
        listaDeIngredientes.add(ing);
    }

    public static double calcularTotal(ArrayList<Ingrediente> ing){
        double total = 0;
        for(Ingrediente ingrediente : ing){
            total += ingrediente.getPrecio();
        }
        return total;
    }

    
}
