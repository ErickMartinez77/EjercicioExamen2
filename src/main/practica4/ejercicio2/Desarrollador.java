package main.practica4.ejercicio2;

public class Desarrollador implements IObserver{
    String nombre;

    public Desarrollador (String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String msg) {
        System.out.println("YouTubeUser : "+this.nombre+"  > [Notificacion recibida] : "+msg);
    }

    @Override
    public Desarrollador getDesarrollador() {
        return null;
    }
}
