package main.practica5.bridge;

public class Credito implements Cuentas {
    Moneda moneda;
    double montoBolivianos;
    @Override
    public void tipoCuenta(Moneda moneda,double montoBolivianos) {
        System.out.println("Credito, interes del 0%");
        this.moneda = moneda;
        this.montoBolivianos=(montoBolivianos);
        this.moneda.cambio(this.montoBolivianos);
    }
}
