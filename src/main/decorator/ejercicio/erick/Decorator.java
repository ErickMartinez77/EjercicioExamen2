package main.decorator.ejercicio.erick;

public class Decorator implements Cuenta{
    private Cuenta componente;

    public Decorator (Cuenta componente){
        this.componente= componente;
    }

    @Override
    public void ejecucionCode() { this.componente.ejecucionCode();
    }

    @Override
    public int getMonto() {
        return componente.getMonto();
    }

    @Override
    public void setMonto(int monto) {
    }
}
