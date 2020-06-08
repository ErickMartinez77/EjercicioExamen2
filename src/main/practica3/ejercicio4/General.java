package main.practica3.ejercicio4;

public class General implements IEjercito {
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
        if (soldado.getOrden().equals("Entrevistas")){
            System.out.println("Orden: entrevistas, sera atendido por: General");
        } else {
            this.next.criteriaHandler(soldado);
        }
    }
}
