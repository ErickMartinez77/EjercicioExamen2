package main.practicaN3.ejercicio2;

public class Notario implements ICarnetizacion {

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
        if(cliente.isFicha() && !cliente.isCertificado() && cliente.isPagoAlBanco()){
            System.out.println("Usted no aporta el certificado de nacimiento, sera atendido por el notario");
        }else{
            this.next.criteriaHandler(cliente);
        }
    }
}