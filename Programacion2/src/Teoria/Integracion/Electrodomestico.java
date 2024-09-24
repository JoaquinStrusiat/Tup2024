package Teoria.Integracion;

public class Electrodomestico {
    double precio;
    double peso;
    String color;
    char consumoEnergetico;

    static final String colors[] = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
    static final char consumos[] = {'A', 'B', 'C', 'D', 'E', 'F'};

    protected static final double precioBase = 100000;
    protected static final double pesoBase = 5;
    protected static final String colorBase = "Blanco";
    protected static final char consumoEnergeticoBase = 'f';



    public Electrodomestico(){
        this(precioBase, pesoBase, colorBase, consumoEnergeticoBase);
    }
    
    public Electrodomestico(double precio, double peso){
        this(precio, peso, colorBase, consumoEnergeticoBase);
    }

    public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {
        this.precio = precioBase;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }

    public void comprobarConsumoEnergetico(){

    }

    
}
