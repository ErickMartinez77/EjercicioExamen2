package main.practica3.ejercicio2;

public class Segip implements ICarnetizacion {
    private ICarnetizacion next;
    @Override
    public void setNext(ICarnetizacion handler) {
        this.next=handler;
    }

    @Override
    public ICarnetizacion next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(Persona cliente) {

        ResponsableCarnetizacion responsableCarnetizacion = new ResponsableCarnetizacion();
        Notario notario = new Notario();
        Cajero cajero = new Cajero();
        AyudaCliente ayudaCliente = new AyudaCliente();

        this.setNext(responsableCarnetizacion);
        responsableCarnetizacion.setNext(notario);
        notario.setNext(cajero);
        cajero.setNext(ayudaCliente);

        this.next.criteriaHandler(cliente);
    }
}