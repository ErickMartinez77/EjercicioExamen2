package main.practicaN3.ejercicio4;

public class Ejercito implements IEjercito{
    private IEjercito next;
    @Override
    public void setNext(IEjercito handler) {
        this.next=handler;
    }

    @Override
    public IEjercito next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(Persona soldado) {
        General general = new General();
        Teniente teniente = new Teniente();
        Coronel coronel = new Coronel();
        Cabo cabo = new Cabo();

        this.setNext(general);
        general.setNext(teniente);
        teniente.setNext(coronel);
        coronel.setNext(cabo);

        this.next.criteriaHandler(soldado);
    }
}
