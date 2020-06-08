package main.practica3.ejercicio4;

public interface IEjercito {
    void setNext(IEjercito handler);
    IEjercito next();
    void criteriaHandler(Persona soldado);
}
