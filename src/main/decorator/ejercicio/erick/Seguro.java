package main.decorator.ejercicio.erick;

public class Seguro extends Decorator{

    private Cuenta componente;

    public Seguro(Cuenta componente) {
        super(componente);
        this.componente= componente;
    }

    @Override
    public void ejecucionCode() {
        super.ejecucionCode();
        System.out.println("Funcionalidad: Seguro de la cuenta");
        componente.setMonto(componente.getMonto()-200);
    }
}
