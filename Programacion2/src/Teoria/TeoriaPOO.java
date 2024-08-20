package Teoria;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;


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
        "------------------------------ " +
        "\nNombre: " + nombre +
        "\n Apellido: " + apellido +
        "\n Edad: " + edad + 
        "\n DNI: " + dni +
        "\n Sexo: " + sexo +
        "\n------------------------------ ";
        return getPersona;
    }   
}

public class TeoriaPOO {
    public static void main(String[] args) throws Exception {
        ArrayList<Persona> ListaPersonas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
            System.out.println("------Base de Datos de Personas------");
            boolean pass = true;
            while (pass) {
                System.out.print(
                    "\nIngrese una opcion:"+ 
                    "\n\t1_ Cargar una nueva Persona"+
                    "\n\t2_ Ver Personas"+
                    "\n\t3_ Modificar Persona"+
                    "\n\t4_ Salir"+
                    "\n\nINGRESE OPCION: "
                    );
                    int value = sc.nextInt();
                    sc.nextLine();
                    switch (value) {
                        case 1:
                            System.out.print("Ingrese su/sus Nombre/s: ");
                            String name = sc.nextLine();
                            System.out.print("Ingrese su/sus Apellido/s: ");
                            String apellido = sc.nextLine();
                            System.out.print("Ingrese su fecha de nacimiento (dd/MM/yyyy): ");
                            String fechaNacimiento = sc.nextLine();
                            System.out.print("Ingrese su DNI: ");
                            int dni = sc.nextInt();
                            System.out.print("Ingrese su sexo (M/F/X): ");
                            char sexo = sc.next().charAt(0);

                            //Creo un nuevo objeto Persona
                            Persona nuevaPersona = new Persona(name, apellido, fechaNacimiento, dni, sexo);
                            //Lo agrego a mi lista
                            ListaPersonas.add(nuevaPersona); 
                            System.out.println("---PERSONA CARGADA CON EXITO---");
                            break;
                        case 2:
                            for(Persona persona : ListaPersonas){
                                System.out.println(persona.toString());
                            }
                            break;
                        case 3:
                            break;
                        case 4:
                            pass = false;
                            break;
                        default:
                            System.out.println("OPCION NO VALIDA");
                    }
            }
        sc.close();
    }
}
