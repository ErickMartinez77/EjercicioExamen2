package main.command.ejercicio.erick;

public class Cliente {
    public static void main (String [] args){
        Receiver receiver = new Receiver();

        Reiniciar reiniciar = new Reiniciar(receiver);
        Apagar apagar = new Apagar(receiver);
        Suspender suspender = new Suspender(receiver);
        CerrarSesion cerrarSesion = new CerrarSesion(receiver);

        ComputadoraInvoker computadoraInvoker = new ComputadoraInvoker();

        computadoraInvoker.setCommand(reiniciar);
        computadoraInvoker.setCommand(apagar);
        computadoraInvoker.setCommand(suspender);
        computadoraInvoker.setCommand(cerrarSesion);

        computadoraInvoker.runCommand();
    }
}
