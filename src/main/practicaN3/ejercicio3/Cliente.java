package main.practicaN3.ejercicio3;

public class Cliente {
    public static void main (String [] args){
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        VersionadorTesis vt;
        vt = new VersionadorTesis("Estado 1","Esta es la estado 1");
        originator.setState(vt);
        careTaker.addMemento(vt.getState(),originator.createMemento());

        vt = new VersionadorTesis("Estado 2","Esta es la estado 2");
        originator.setState(vt);
        careTaker.addMemento(vt.getState(),originator.createMemento());

        vt = new VersionadorTesis("Estado 3","Esta es la estado 3");
        originator.setState(vt);
        careTaker.addMemento(vt.getState(),originator.createMemento());

        vt = new VersionadorTesis("Estado 4","Esta es la estado 5");
        originator.setState(vt);
        careTaker.addMemento(vt.getState(),originator.createMemento());

        vt = new VersionadorTesis("Estado 5","Esta es la estado 5");
        originator.setState(vt);

        originator.restoreFromMemento(careTaker.getMemento("Esta es la estado 3"));
    }
}
