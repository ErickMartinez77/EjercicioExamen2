package main.command.ejercicio.erick;

public class Reiniciar implements ICommand {
    private Receiver receiver;

    public Reiniciar(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        this.receiver.reiniciar();
    }
}
