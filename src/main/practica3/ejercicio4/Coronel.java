package main.practica3.ejercicio4;

public class Coronel implements IEjercito {
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
        if (soldado.getOrden().equals("Desbloqueos") ||soldado.getOrden().equals("Manifestaciones") ){
            System.out.println("Orden: Desbloqueos/Manifestaciones, sera atendido por: Coronel");
        } else {
            this.next.criteriaHandler(soldado);
        }
    }
}
