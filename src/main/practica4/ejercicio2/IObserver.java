package main.practica4.ejercicio2;

public interface IObserver {
    Desarrollador desarrollador = new Desarrollador("");
    void update(String msg);
    Desarrollador getDesarrollador();
}
