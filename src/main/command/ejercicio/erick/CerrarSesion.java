package main.command.ejercicio.erick;

public class CerrarSesion implements ICommand{
    private Receiver receiver;

    public CerrarSesion(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        this.receiver.cerrarSesion();
    }
}
