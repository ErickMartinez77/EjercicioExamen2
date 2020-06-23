package main.practica5.bridge;

public class PlazoFijo implements Cuentas {
    Moneda moneda;
    double montoBolivianos;
    @Override
    public void tipoCuenta(Moneda moneda,double montoBolivianos) {
        System.out.println("Plazo fijo, interes del 5%");
        this.moneda = moneda;
        this.montoBolivianos=(montoBolivianos*1.05);
        this.moneda.cambio(this.montoBolivianos);
    }
}
