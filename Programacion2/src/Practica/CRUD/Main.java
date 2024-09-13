package Practica.CRUD;
import java.util.Scanner;
//import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean pass = true;
        while (pass) {
            System.out.println("\nMENU PRINCIPAL");
            System.out.print(
                "\t1 - Ver Lista de Objetos" +
                "\n\t2 - Crear un nuevo objeto" + 
                "\n\t3 - Eliminar un objeto" +
                "\n\t4 - Modificar un objeto" +
                "\n\t5 - Salir" +
                "\n\tINGRESE OPCION: ");
            int val = sc.nextInt();


            switch (val) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    pass = false;
                    break;
            
                default:
                    break;
            }            
        }
        sc.close();
    }
}
