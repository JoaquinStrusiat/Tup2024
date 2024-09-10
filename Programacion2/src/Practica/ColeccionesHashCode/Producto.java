package Practica.ColeccionesHashCode;

public class Producto {
    private String nombre;
    private int codProd;
    private int stock;

    public Producto(String nombre, int codProd, int stock) {
        this.nombre = nombre;
        this.codProd = codProd;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodProd() {
        return codProd;
    }

    public int getStock() {
        return stock;
    }
    
    public boolean equals(Producto p){
        if(this == p) return true;
        if(p == null || getClass() != p.getClass()) return false;
        return codProd == p.getCodProd();
    }

    public static void main(String[] args) {
        Producto producto1 = new Producto("CocaCola", 1234, 5);
        Producto producto2 = new Producto("Puchito", 5678, 10);

        if (producto1.equals(producto2)) {
            System.out.println("Mismo Prooducto");
        } else {
            System.out.println("Diferente Producto");
        }
    }
    

}
