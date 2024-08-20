package Teoria;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


class Persona {
    private String nombre, apellido, fechaNacimiento;
    private int dni;
    private char sexo;

    public Persona(String nombre, String apellido, String fechaNacimiento, int dni, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.sexo = sexo;
    }

    public String toString() {
        //Formato de fecha a usar.
        DateTimeFormatter Formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Doy formato de fecha a mi atributo "fechaNacimiento".
        LocalDate nacimientoFormateaDate = LocalDate.parse(fechaNacimiento, Formato);
        //Calculo la edad pasando el la fecha formateada y la fecha actual a Period.
        Period edad = Period.between(nacimientoFormateaDate, LocalDate.now());

        String getPersona = 
        "Nombre: " + nombre +
        "\n Apellido: " + apellido +
        "\n Edad: " + edad + 
        "\n DNI: " + dni +
        "\n Sexo: " + sexo;

        return getPersona;
    }
    
    
    
}

public class TeoriaPOO {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
