package main.practica5.bridge;

public class Dolares implements Moneda {
    @Override
    public void cambio(double montoBolivianos) {
        System.out.println("Cambio monto: "+montoBolivianos);
    }
}
