package Practica.SupermercadoPOO;

import java.util.ArrayList;
import java.util.Scanner;

import Practica.SupermercadoPOO.Clases.Caja;
import Practica.SupermercadoPOO.Clases.Cliente;
import Practica.SupermercadoPOO.Clases.Empleado;
import Practica.SupermercadoPOO.Clases.Producto;

public class utilidades {
    public static Cliente crearCliente(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
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
        Cliente cliente = new Cliente(nombre, apellido, dni, mayorista);
        return cliente;
    } 

    public static ArrayList<Producto> obtenerProductos() {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("CocaCola", 1800));
        productos.add(new Producto("Sprite", 1500));
        productos.add(new Producto("Alfajor Tatin", 600));
        productos.add(new Producto("Caramelos Masticables", 20.50));
        productos.add(new Producto("Pepsi", 1700));
        productos.add(new Producto("Fanta", 1600));
        productos.add(new Producto("Galletitas Oreo", 800));
        productos.add(new Producto("Chicles", 50));
        return productos;
    }

    public static ArrayList<Caja> getCajas(Empleado empleado1, Empleado empleado2) {
    ArrayList<Caja> cajas = new ArrayList<>();
    cajas.add(new Caja(empleado1, 1));
    cajas.add(new Caja(empleado2, 2));
    cajas.add(new Caja(empleado1, 3));
    cajas.add(new Caja(empleado2, 4));
    return cajas;
}
}
