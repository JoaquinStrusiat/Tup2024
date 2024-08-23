package Practica.SupermercadoPOO.Clases;

public class Caja {
    private Empleado empleado;
    private int nroCaja;

    public Caja(Empleado empleado, int nroCaja){
        this.empleado = empleado;
        this.nroCaja = nroCaja;
    }

    public String getInfoCaja(){
        return "Empleado: " + empleado.getNombreCompleto() + "\nNumero de Caja: " + this.nroCaja;
    }


}
