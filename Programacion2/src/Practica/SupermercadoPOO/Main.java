package Practica.SupermercadoPOO;
import Practica.SupermercadoPOO.Clases.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            //CCreamos 2 empleados por defecto 
            Empleado empleado1 = new Empleado("Federico", "Aranda", 12345678, 100000);
            Empleado empleado2 = new Empleado("Joaquin", "Strusiat", 87654321, 100000);
 
            // Para simplificar el codigo vamos a crear manualmente 4 cajas
            Caja caja1 = new Caja(empleado1, 1);
            Caja caja2 = new Caja(empleado2, 2);
            Caja caja3 = new Caja(empleado1, 3);
            Caja caja4 = new Caja(empleado2, 4);
            
            System.out.println("--------Inicio de compra--------");

            //Creamos un cliente llamando a la funcion crearCliente
            Cliente cliente1 = utilidades.crearCliente();
            
            //Obtengo los productos
            ArrayList<Producto> listaProductos = utilidades.obtenerProductos();

            //Mostramos los Productos
            System.out.println("\n----------------Productos----------------");
            for (int i = 0; i < listaProductos.size(); i++) {
                System.out.println("\n" +"[" + i + "] " + listaProductos.get(i) );
            }

            //Creamos el carrito deonde vamos a guardar los productos comprados
            ArrayList<Producto> carrito = new ArrayList<>();

            boolean pas = true;
            while (pas) {
                System.out.println("\n------------Carrito de compras------------");
                if (carrito.size() >= 1) {
                    for(Producto producto : carrito){
                        System.out.println(producto.getProducto());
                    }
                } else {
                    System.out.println("Carrito vacio");
                }
                System.out.println("------------------------------------------");
                
                System.out.println(
                    "Ingrese una opcion:" + 
                    "\n\t1-Agregar producto al carrito" + 
                    "\n\t2-Finalizar Compra" + 
                    "\n\t3-Salir" + 
                    "\n\tOPCION: ");
                int val = sc.nextInt();

                switch (val) {
                    case 1:
                        System.out.print("Ingrese el indice del producto que quiere agregar al carrito: ");
                        int ind = sc.nextInt();
                        System.out.print("Ingrese la cantidad de unidades requeridas: ");
                        int uni = sc.nextInt();
                        listaProductos.get(ind).setCantidad(uni);
                        carrito.add(listaProductos.get(ind));
                        break;
                    case 2:
                        pas = false;
                        break;
                    case 3:
                        pas = false;
                        break;
                    default:
                        System.out.println("OPCION INVALIDA");
                        break;
                }
            }
        sc.close();
    }  
}
