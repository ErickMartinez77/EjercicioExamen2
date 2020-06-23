package main.proxy.ejercicio.erick;

public class Cliente {
    public static void main(String [] args){
        Proxy proxy = new Proxy();
        proxy.setRequest(new Request(".rar","Descargar"));
        proxy.request();
    }
}
