package main.decorator.ejercicio.erick;

public class Client {
    public static void main (String [] sada){
        Cuenta cuenta1 = new CuentaBasica(3000,"Erick");
        Cuenta cuenta2 = new CuentaBasica(2000,"Pedro");
        System.out.println("--------------------------------");

        cuenta1.ejecucionCode();
        cuenta2.ejecucionCode();

        System.out.println("--------------------------------");
        
        cuenta2= new Promocion(cuenta2);

        cuenta1 = new Promocion(cuenta1);
        cuenta1 = new BancaInternet(cuenta1);
        cuenta1 =new Seguro(cuenta1);

        cuenta2.ejecucionCode();
        cuenta1.ejecucionCode();
    }
}
