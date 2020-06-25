package main.decorator.ejercicio.erick;

public class BancaInternet extends Decorator {

    private Cuenta componente;
    private Boolean enable;

    public BancaInternet(Cuenta componente) {
        super(componente);
        this.componente= componente;
    }

    @Override
    public void ejecucionCode() {
        super.ejecucionCode();
        System.out.println("Funcionalidad: Banca Por Internet");
        enable=true;
    }

}
