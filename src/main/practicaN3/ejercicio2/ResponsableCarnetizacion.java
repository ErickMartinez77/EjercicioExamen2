package main.practicaN3.ejercicio2;

public class ResponsableCarnetizacion implements ICarnetizacion {

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
        if(cliente.isFicha() && cliente.isCertificado() && cliente.isPagoAlBanco()){
            System.out.println("Usted cuenta con todos los requisitos, sera atendido por Carnetizacion");
        }else{
            this.next.criteriaHandler(cliente);
        }
    }
}