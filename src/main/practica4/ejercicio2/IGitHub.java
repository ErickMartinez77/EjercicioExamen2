package main.practica4.ejercicio2;

public interface IGitHub {
    void attach(IObserver observer);
    void deAttach(IObserver observer);
    void notifyObserver();
}
