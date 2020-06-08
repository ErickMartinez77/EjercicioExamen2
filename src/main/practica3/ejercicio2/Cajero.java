package main.practica3.ejercicio2;

public class Cajero implements ICarnetizacion {

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
        if(cliente.isFicha() && cliente.isCertificado() && !cliente.isPagoAlBanco()){
            System.out.println("Usted no cuenta con el pago al banco, sera atendido por el cajero");
        }else{
            this.next.criteriaHandler(cliente);
        }
    }
}