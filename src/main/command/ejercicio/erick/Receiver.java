package main.command.ejercicio.erick;

public class Receiver {
    private String reiniciar = "reiniciar";
    private String apagar = "apagar";
    private String suspender = "suspender";
    private String cerrarSesion = "cerrarSesion";
    public String hora = "8:00";
    public String usuario = "Erick";

    public void reiniciar(){
        System.out.println("COMMAND > Operation 1\t>\t" + reiniciar+", "+"Hora actual: "+hora+", "+"Usuario: "+usuario);
    }

    public void apagar(){
        System.out.println("COMMAND > Operation 2\t>\t" + apagar+", "+"Hora actual: "+hora+", "+"Usuario: "+usuario);
    }

    public void suspender(){
        System.out.println("COMMAND > Operation 3\t>\t" + suspender+", "+"Hora actual: "+hora+", "+"Usuario: "+usuario);
    }

    public void cerrarSesion(){
        System.out.println("COMMAND > Operation 4\t>\t" + cerrarSesion+", "+"Hora actual: "+hora+", "+"Usuario: "+usuario);
    }

    public String getReiniciar() {
        return reiniciar;
    }

    public void setReiniciar(String reiniciar) {
        this.reiniciar = reiniciar;
    }

    public String getApagar() {
        return apagar;
    }

    public void setApagar(String apagar) {
        this.apagar = apagar;
    }

    public String getSuspender() {
        return suspender;
    }

    public void setSuspender(String suspender) {
        this.suspender = suspender;
    }

    public String getCerrarSesion() {
        return cerrarSesion;
    }

    public void setCerrarSesion(String cerrarSesion) {
        this.cerrarSesion = cerrarSesion;
    }
}
