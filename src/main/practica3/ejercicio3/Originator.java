package main.practica3.ejercicio3;

public class Originator {
    private VersionadorTesis state;

    public VersionadorTesis getState(){
        return state;
    }

    public void setState(VersionadorTesis state) {
        System.out.println("Set ----> Object -----");
        state.showData();
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("Create ---->  Object  -----");
        state.showData();
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento n){
        this.state= n.getState();
        System.out.println("Restore --- > Object  ");
        this.state.showData();


    }
}
