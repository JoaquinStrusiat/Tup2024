package Practica;
class Auto {
    private String Marca, Modelo, Motor, Color;
    private double Precio;

    public Auto(String marca, String modelo, String motor, String color, double precio){
        this.Marca = marca;
        this.Modelo = modelo;
        this.Motor = motor;
        this.Color = color;
        this.Precio = precio;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public void setMotor(String motor) {
        Motor = motor;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }
    
    public String getInfoCompleta() {
        return "Marca: " + this.Marca + 
               "\nModelo: " + this.Modelo + 
               "\nMotor: " + this.Motor + 
               "\nColor: " + this.Color + 
               "\nPrecio: $" + this.Precio;
    }
    
}

public class AutoPOO{
    public static void main(String[] args) {

        Auto auto1 = new Auto(
            "Toyota", 
            "Hilux", 
            "Duramax 2.4", 
            "Blanca", 
            40000);

        System.out.println(auto1.getInfoCompleta());

        
    }
}

