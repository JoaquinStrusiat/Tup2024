package Practica.SupermercadoPOO;
import Practica.SupermercadoPOO.Clases.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            //Aca se crea a un comentiro :3 
            Empleado empleado1 = new Empleado("Federico", "Aranda", 12345678, 100000);
            Empleado empleado2 = new Empleado("Joaquin", "Strusiat", 87654321, 100000);
            
            // Para simplificar el codigo vamos a crear manualmente 4 cajas
            Caja caja1 = new Caja(empleado1, 1);
            Caja caja2 = new Caja(empleado2, 2);
            Caja caja3 = new Caja(empleado1, 3);
            Caja caja4 = new Caja(empleado2, 4);
            
            System.out.println("--------Inicio de compra--------");
            System.out.print("Ingrese su Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese su Apellido: ");
            String apellido = sc.nextLine();
            System.out.print("Ingrese su DNI: ");
            int dni = sc.nextInt();
            System.out.print("Para compra mayorista ingrese 1, de lo contrario 0: ");
            int bandera = sc.nextInt();
            boolean mayorista = false;  
            if ( bandera == 1){
                mayorista = true;
            }
            //Creamos el nuevo Cliente
            Cliente cliente1 = new Cliente(nombre, apellido, dni, mayorista);
            
        sc.close();
    }
    
}
