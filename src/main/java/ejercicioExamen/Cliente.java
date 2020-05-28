package main.java.ejercicioExamen;

public class Cliente {
    public static void main (String [] args){

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Prestamo vivienda = new Prestamo("Vivienda");
                vivienda.realizarPrestamo(200);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Prestamo negocio = new Prestamo("Negocio");
                negocio.realizarPrestamo(300);
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Prestamo credito = new Prestamo("Credito");
                credito.realizarPrestamo(200);
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                Prestamo financiamiento = new Prestamo("Financiamiento");
                financiamiento.realizarPrestamo(100);
            }
        });

        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
    }
}
