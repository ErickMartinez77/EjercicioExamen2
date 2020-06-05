package main.observer.ejercicio.erick;

public class Suscriptor1 implements IObserver{

    @Override
    public void update(String msg,String msg1,String msg2) {
        System.out.println("Suscriptor1  > [Notificacion se añadio un video]"+ msg + " " +msg1+ " "+msg2+ " ");
    }
}