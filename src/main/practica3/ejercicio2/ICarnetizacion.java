package main.practica3.ejercicio2;

public interface ICarnetizacion {
    void setNext(ICarnetizacion handler);
    ICarnetizacion next();
    void criteriaHandler(Persona cliente);
}
