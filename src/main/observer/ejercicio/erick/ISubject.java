package main.observer.ejercicio.erick;

public interface ISubject {
    void attach(IObserver observer);
    void deAttach(IObserver observer);
    void notifyObserver(Videos videos);
}
