package main.practica4.ejercicio2;

import java.util.ArrayList;

public class VersionadorGitHub implements IGitHub{

    private ArrayList<IObserver> observers = new ArrayList<>();
    private String cambio;
    //private String state;

    public VersionadorGitHub (String cambio){
        this.cambio = cambio;
        //this.state = state;
    }

    public void showData(){
        System.out.println("texto : "+this.cambio);
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }


    @Override
    public void attach(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void deAttach(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer:observers){
            observer.update("[Notify]");
        }
    }
}
