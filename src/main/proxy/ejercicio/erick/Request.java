package main.proxy.ejercicio.erick;

public class Request {
    private String formato;
    private String accion;

    public Request (String formato, String accion){
        this.formato = formato;
        this.accion = accion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }
}
