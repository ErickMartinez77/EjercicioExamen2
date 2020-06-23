package main.practica5.bridge;

public class Ahorro implements Cuentas {
    Moneda moneda;
    double montoBolivianos;
    @Override
    public void tipoCuenta(Moneda moneda, double montoBolivianos) {
        System.out.println("Caja de ahorro, Interes del 2%");
        this.moneda = moneda;
        this.montoBolivianos=(montoBolivianos*1.02);
        this.moneda.cambio(this.montoBolivianos);
    }
}
