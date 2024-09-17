package Practica.CalculadoraComida;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de precio de platillos: ");

        //Lista de ingredientes a usar por platillo
        ArrayList<Ingrediente> nuevaListaDeIng = new ArrayList<>();

        boolean pass = true;
        while (pass) {
            System.out.println("\n=== Menú de Opciones ===");
            System.out.println("1. Cargar ingredientes");
            System.out.println("2. Ver ingredientes cargados");
            System.out.println("3. Calcular plato");
            System.out.println("4. Lista de Ingredientes y Costo por plato");
            System.out.println("5. Lista de la Compra");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int val = sc.nextInt();
            sc.nextLine();
            switch (val) {
                case 1:
                    //Carga de ingredientes
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
                    //Ver lista de ingredientes Cargados
                    System.out.println("\nLista de ingredientes Cargados: ");
                    System.out.println("----------------------------------------");
                    for(Ingrediente ing : Ingrediente.getListaDeIngredientes()){
                        System.out.println(ing.toString());
                    }
                    System.out.println("----------------------------------------");
                    break;
                case 3:
                    //Calcular plato
                    System.out.println("\n----Calcular Plato----");
                    System.out.println("Ingrese la cantidad de ingrediente a usar en cada Plato: ");
                    nuevaListaDeIng.clear();
                    for(Ingrediente ing : Ingrediente.getListaDeIngredientes()){
                        System.out.print("Cantidad de " + ing.getNombre() + " a usar: ");
                        double cantidadAUsar = sc.nextDouble();
                        double precioPorCantidad = (cantidadAUsar*ing.getPrecio())/ing.getCantidad();
                        Ingrediente ingNuevo = new Ingrediente(ing.getNombre(), cantidadAUsar, precioPorCantidad);
                        nuevaListaDeIng.add(ingNuevo);
                    }
                    System.out.println("\nCosto por Ingrediente:");
                    System.out.println("----------------------------------------");
                    for(Ingrediente ing : nuevaListaDeIng){
                        System.out.println(ing.toString());
                    }
                    System.out.println("--------------------");
                    System.out.println("Costo por plato: $" + Ingrediente.calcularTotal(nuevaListaDeIng));
                    System.out.println("--------------------");
                    break;
                case 4:
                    //Ver Ingredientes por plato y subtotal

                    System.out.println("\nCosto por Ingrediente:");
                    System.out.println("----------------------------------------");
                    for(Ingrediente ing : nuevaListaDeIng){
                        System.out.println(ing.toString());
                    }
                    System.out.println("--------------------");
                    System.out.println("Costo por plato: $" + Ingrediente.calcularTotal(nuevaListaDeIng));
                    System.out.println("--------------------");
                    break;
                case 5:
                    System.out.println("\n---- Lista de la Compra ----");

                    // Pedir al usuario cuántos platos necesita hacer
                    System.out.print("\nIngrese la cantidad de platos que necesita hacer: ");
                    int cantidadPlatos = sc.nextInt();

                    System.out.println("\n-------------------------------------------- Lista de la Compra --------------------------------------------------------");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------");
                    System.out.println(String.format("%-25s | %-25s | %-20s | %-25s | %-20s", 
                    "Ingrediente", "Cantidad a Usar (Total)", "Precio por Unidad", "Mínimo de Unidades", "Precio Total"));
                    System.out.println("------------------------------------------------------------------------------------------------------------------------");

                    double subtotal = 0.0;

                    for (int i = 0; i < Ingrediente.getListaDeIngredientes().size(); i++) {
                        // Obtenemos el ingrediente de listaDeIngredientes y nuevaListaDeIng por índice
                        Ingrediente ingBase = Ingrediente.getListaDeIngredientes().get(i);
                        Ingrediente ingNuevo = nuevaListaDeIng.get(i);

                        // Cantidad por unidad del ingrediente cargado (por paquete o unidad)
                        double cantidadPorUnidad = ingBase.getCantidad(); // Cantidad por unidad en el paquete

                        // Cantidad que necesitamos por plato (ya que está en nuevaListaDeIng)
                        double cantidadAUsarPorPlato = ingNuevo.getCantidad();

                        // Calcular la cantidad total de ingrediente a usar según los platos
                        double cantidadTotalAUsar = cantidadAUsarPorPlato * cantidadPlatos;

                        // Calcular cuántas unidades necesitamos (redondeo hacia arriba)
                        int unidadesRequeridas = (int) Math.ceil(cantidadTotalAUsar / cantidadPorUnidad);

                        // Calcular el precio por unidad
                        double precioPorUnidad = ingBase.getPrecio();

                        // Calcular el precio total para esas unidades
                        double precioTotal = unidadesRequeridas * precioPorUnidad;

                        // Mostrar los detalles del ingrediente usando String.format para alinear columnas
                        System.out.println(String.format("%-25s | %-25.2f | $%-18.2f | %-25d | $%-18.2f", 
                        ingBase.getNombre(), cantidadTotalAUsar, precioPorUnidad, unidadesRequeridas, precioTotal));

                        // Sumar al subtotal
                        subtotal += precioTotal;
                    }
                    System.out.println("------------------------------------------------------------------------------------------------------------------------");
                    System.out.println(String.format("Subtotal para comprar todos los ingredientes: $%.2f", subtotal));
                    System.out.println("------------------------------------------------------------------------------------------------------------------------");
                    break;
                case 6:
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
