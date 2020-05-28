package main.java.ejercicioExamen;

public class Prestamo {
    String tipoPrestamo;
    public Prestamo(String tipoPrestamo){
        this.tipoPrestamo = tipoPrestamo;
    }

    public void realizarPrestamo(int saldoCuenta){
        Cajero.getInstance().setSaldoCuenta(1000);
        Cajero.getInstance().getPrestamo(saldoCuenta);

    }
}
