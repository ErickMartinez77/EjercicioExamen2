package main.practicaN3.ejercicio3;


import java.util.HashMap;

public class CareTaker {
    private HashMap<String, Memento> savedStates = new HashMap<>();

    public void addMemento(String s,Memento memento) {
        this.savedStates.put(s,memento);
    }

    public Memento getMemento(String s) {
        return this.savedStates.get(s);
    }
}
