package Practica.CalculadoraComida;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de precio de platillos: ");
        boolean pass = true;
        while (pass) {
            System.out.println("\n=== Menú de Opciones ===");
            System.out.println("1. Cargar ingredientes");
            System.out.println("2. Ver ingredientes");
            System.out.println("3. Calcular platillo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int val = sc.nextInt();
            sc.nextLine();
            switch (val) {
                case 1:
                    System.out.println("\n----Ingrese los datos del ingrediente----");
                    System.out.print("Nombre del ingrediente: ");
                    String nombre = sc.nextLine();
                    System.out.print("Cantidad (unidades/cc/gramos): ");
                    double cantidad = sc.nextDouble();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    Ingrediente ingrediente = new Ingrediente(nombre, cantidad, precio);
                    Ingrediente.setListaDeIngredientes(ingrediente);
                    break;
                case 2:
                    System.out.println("\nPLista de ingredientes Cargados: ");
                    System.out.println("----------------------------------------");
                    for(Ingrediente ing : Ingrediente.getListaDeIngredientes()){
                        System.out.println(ing.toString());
                    }
                    System.out.println("----------------------------------------");
                    break;
                case 3:
                    System.out.println("\n----Calcular platillo----");
                    System.out.println("A continuación ingrese la cantidad de ingrediente a usar: ");
                    ArrayList<Ingrediente> nuevaListaDeIng = new ArrayList<>();
                    for(Ingrediente ing : Ingrediente.getListaDeIngredientes()){
                        System.out.print("Cantidad de " + ing.getNombre() + " a usar: ");
                        double cantidadAUsar = sc.nextDouble();
                        double precioPorCantidad = (cantidadAUsar*ing.getPrecio())/ing.getCantidad();
                        Ingrediente ingNuevo = new Ingrediente(ing.getNombre(), cantidadAUsar, precioPorCantidad);
                        nuevaListaDeIng.add(ingNuevo);
                    }
                    System.out.println("\nPrecios por cantidad y total:");
                    System.out.println("----------------------------------------");
                    for(Ingrediente ing : nuevaListaDeIng){
                        System.out.println(ing.toString());
                    }
                    System.out.println("--------------------");
                    System.out.println("Total: $" + Ingrediente.calcularTotal(nuevaListaDeIng));
                    System.out.println("--------------------");
                    break;
                case 4:
                    System.out.println("\nSaliendo del programa...");
                    pass = false;
                    break;
                default:
                    System.out.println("\nOpción inválida. Intente de nuevo.");
                    break;
            }            
        }
        sc.close();
    }
}
