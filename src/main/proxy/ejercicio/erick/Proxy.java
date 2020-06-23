package main.proxy.ejercicio.erick;

public class Proxy implements IServidor{
    private Servidor servidor;
    private Servidor servidor2;
    private Request request;

    public Proxy (){
        servidor = new Servidor();
        servidor2 = new Servidor();
    }

    @Override
    public void request() {
        if (request.getAccion().equals("Descarga")||request.getAccion().equals("Carga") && request.getFormato().equals(".zip")||request.getFormato().equals(".rar")){
            this.servidor2.setRequest(request);
            this.servidor2.request();
        } else {
            System.out.println("El formato es incorrecto: "+request.getFormato());
        }
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
