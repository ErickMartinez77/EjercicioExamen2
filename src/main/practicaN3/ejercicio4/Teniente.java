package main.practicaN3.ejercicio4;

public class Teniente implements IEjercito {
    private IEjercito next;
    @Override
    public void setNext(IEjercito handler) {
        this.next = handler;
    }

    @Override
    public IEjercito next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(Persona soldado) {
        if (soldado.getOrden().equals("Disciplina")){
            System.out.println("Orden: Disciplina, sera atendido por: Teniente");
        } else {
            this.next.criteriaHandler(soldado);
        }
    }
}
