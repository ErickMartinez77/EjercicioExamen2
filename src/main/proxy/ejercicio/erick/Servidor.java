package main.proxy.ejercicio.erick;

public class Servidor implements IServidor{
    private Request request;
    public Servidor(){}

    @Override
    public void request() {
        System.out.println("Informacion recibida");
        System.out.println("Formato de archivo: "+request.getFormato());
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
