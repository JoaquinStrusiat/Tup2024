package Practica.SupermercadoPOO.Clases;

public class Empleado extends Humano{
    private double sueldo;

    public Empleado(String nombre, String apellido, int dni, double sueldo) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
    }

    public String toString() {
        return super.toString() + "\nSueldo: " + this.sueldo;
    }

    public String getNombreEmpleado(){
        return super.getNombreCompleto();
    }
    
}
