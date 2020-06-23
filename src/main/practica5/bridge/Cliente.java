package main.practica5.bridge;

public class Cliente {
    public static void main(String [] args){
        Bolivianos bolivianos = new Bolivianos();
        Dolares dolares = new Dolares();
        Euros euros = new Euros();

        Ahorro ahorro = new Ahorro();
        PlazoFijo plazoFijo = new PlazoFijo();
        Credito credito = new Credito();

        ahorro.tipoCuenta(bolivianos,100);
        plazoFijo.tipoCuenta(dolares,200);
        credito.tipoCuenta(euros,300);
    }
}
