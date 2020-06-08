package main.practica3.ejercicio3;

public class Memento {
    private VersionadorTesis state;

    public Memento(VersionadorTesis stateSaved){
        this.state = stateSaved;
    }

    public VersionadorTesis getState() {
        return state;
    }

    public void setState(VersionadorTesis state) {
        this.state = state;
    }
}
