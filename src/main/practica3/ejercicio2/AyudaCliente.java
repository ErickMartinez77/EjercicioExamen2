package main.practica3.ejercicio2;

public class AyudaCliente implements ICarnetizacion {

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
        if((!cliente.isFicha() && !cliente.isCertificado()) || (!cliente.isCertificado() && !cliente.isPagoAlBanco()) || (!cliente.isPagoAlBanco() && !cliente.isFicha()) ||(!cliente.isFicha() && !cliente.isCertificado() && !cliente.isPagoAlBanco()) ){
            System.out.println("Usted no cuenta con los requisitos suficientes, sera atendido por Ayuda al Cliente");
        }
    }   
}
