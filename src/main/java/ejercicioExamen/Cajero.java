package main.java.ejercicioExamen;

public class Cajero {
    private static Cajero instance=null;
    private int saldoCuenta;

    public void setSaldoCuenta(int saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public int getSaldoCuenta() {
        return saldoCuenta;
    }

    private Cajero(){
//        System.out.println("Saldo de cuenta: "+saldoCuenta);
    }

    private synchronized static void makeInstance(){
        if (instance == null){
            instance = new Cajero();
        }
    }

    public static Cajero getInstance(){
        if (instance == null){
            makeInstance();
        }
        return instance;
    }

    public void getPrestamo(int cantidad){
        System.out.println("Saldo de cuenta: "+saldoCuenta);
        saldoCuenta = saldoCuenta - cantidad;
        System.out.println("Realizando prestamo de: "+cantidad+ " saldo de cuenta: "+saldoCuenta);
    }


}
