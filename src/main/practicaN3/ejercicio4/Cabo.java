package main.practicaN3.ejercicio4;

public class Cabo implements IEjercito {
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
        if (soldado.getOrden().equals("Limpiezas")){
            System.out.println("Orden: Limpiezas, sera atendido por: Cabo");
        }
    }
}
